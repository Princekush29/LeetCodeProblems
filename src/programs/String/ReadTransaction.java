package programs.String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTransaction {
	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(
				new FileReader("/LeetCodeProblems/src/programs/String/PhonePe_Transaction_Statement.pdf"));

		String line1;
		int lineNum = 1;

		while (true) {
			line1 = br1.readLine();

			if (line1 != null) {
				System.out.println("File1: " + (line1 == null ? "<EOF>" : line1));
			}

		}
	}
}
