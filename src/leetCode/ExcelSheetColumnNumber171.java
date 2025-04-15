package leetCode;

public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		String columnTitle = "AB";
		System.out.println(titleToNumber(columnTitle));
	}

	public static int titleToNumber(String columnTitle) {
		int sum = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			char c = columnTitle.charAt(i);
			System.out.println((int) c);
			sum = sum * 26 + (c - 'A' + 1);
		}
		return sum;
	}
}