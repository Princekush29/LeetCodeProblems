package leetCode;

public class ExcelSheetColumnTitle168 {

	public static void main(String[] args) {
		int columnNumber = 28;
		System.out.println(convertToTitle(columnNumber));
	}

	public static String convertToTitle(int columnNumber) {
		int reminder = 0;
		String title = "";
		char c;
		while (columnNumber != 0) {
			reminder = columnNumber % 26;
			if (reminder == 0) {
				c = (char) (26 + 64);
				reminder = 26;
			} else {
				c = (char) (reminder + 64);
			}
			title = c + title;
			columnNumber = columnNumber - reminder;
			columnNumber = columnNumber / 26;
		}
		return title;
	}
}