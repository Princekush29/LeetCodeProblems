package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCompare {

    public static boolean areFilesEqual(Path file1, Path file2) throws IOException {
        if (!Files.exists(file1) || !Files.exists(file2)) {
            throw new IOException("One or both files do not exist: " + file1 + " , " + file2);
        }

        if (Files.size(file1) != Files.size(file2)) {
            return false; // Optimization: files with different sizes can't be identical
        }

        try (BufferedReader reader1 = Files.newBufferedReader(file1);
             BufferedReader reader2 = Files.newBufferedReader(file2)) {
            String line1;
            String line2;
            while (true) {
                line1 = reader1.readLine();
                line2 = reader2.readLine();
                if (line1 == null && line2 == null) {
                    return true; // both reached EOF
                }
                if (line1 == null || line2 == null) {
                    return false; // one file is longer than the other
                }
                if (!line1.equals(line2)) {
                    return false; // mismatch
                }
            }
        }
    }

    public static void main(String[] args) {
        // Contract: prefer CLI args; otherwise try common workspace-relative locations
        Path f1 = null;
        Path f2 = null;
        Path f3 = null;

        if (args.length >= 2) {
            f1 = Paths.get(args[0]);
            f2 = Paths.get(args[1]);
            if (args.length >= 3) {
                f3 = Paths.get(args[2]);
            }
        } else {
            // Try resolving relative to current working directory (workspace root)
            Path cwd = Paths.get(System.getProperty("user.dir"));
            Path candidate1 = cwd.resolve("LeetCodeProblems/src/programs/file1.txt");
            Path candidate2 = cwd.resolve("LeetCodeProblems/src/programs/file2.txt");
            Path candidate3 = cwd.resolve("LeetCodeProblems/src/programs/file3.txt");

            if (Files.exists(candidate1) && Files.exists(candidate2)) {
                f1 = candidate1;
                f2 = candidate2;
                f3 = candidate3;
            } else {
                // Try a simple relative path (if running from inside the LeetCodeProblems project)
                Path rel1 = Paths.get("src", "programs", "file1.txt");
                Path rel2 = Paths.get("src", "programs", "file2.txt");
                Path rel3 = Paths.get("src", "programs", "file3.txt");
                if (Files.exists(rel1) && Files.exists(rel2)) {
                    f1 = rel1;
                    f2 = rel2;
                    f3 = rel3;
                } else {
                    System.err.println("Could not locate file1.txt and file2.txt. Tried:\n  " + candidate1 + "\n  " + rel1);
                    System.err.println("You can also pass paths as program arguments: java programs.FileCompare <file1> <file2> [file3]");
                    return;
                }
            }
        }

        try {
            System.out.println("Using:\n  file1=" + f1 + "\n  file2=" + f2 + (f3 != null ? "\n  file3=" + f3 : ""));
            System.out.println("file1 and file2 are equal: " + areFilesEqual(f1, f2));
            if (f3 != null && Files.exists(f3)) {
                System.out.println("file1 and file3 are equal: " + areFilesEqual(f1, f3));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}