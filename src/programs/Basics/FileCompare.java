package programs.Basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCompare {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(
				new FileReader("/Users/shreeram/eclipse-workspace/LeetCodeProblems/src/programs/file1.txt"));
		BufferedReader br2 = new BufferedReader(
				new FileReader("/Users/shreeram/eclipse-workspace/LeetCodeProblems/src/programs/file2.txt"));

		String line1;
		String line2;
		int lineNum = 1;
		boolean areEqual = true;

		while (true) {
			line1 = br1.readLine();
			line2 = br2.readLine();

			if (line1 == null && line2 == null) {
				break; //both files ended
			}

			if (line1 == null || line2 == null || !line1.equals(line2)) {
				System.out.println("Files differ at line " + lineNum);
				System.out.println("File1: " + (line1 == null ? "<EOF>" : line1));
				System.out.println("File2: " + (line2 == null ? "<EOF>" : line2));
				areEqual = false;
				break;
			}
			lineNum++;
		}

		if (areEqual) {
			System.out.println("The files are identical in content.");
		}
	}
}