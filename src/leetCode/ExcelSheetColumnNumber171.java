package leetCode;

public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		String columnTitle = "AB";
		System.out.println(titleToNumber(columnTitle));
	}

	public static int titleToNumber(String columnTitle) {
		int d = 0, sum = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			char c = columnTitle.charAt(i);
			System.out.println((int)c);
			d = c * 26 - (c - 65) * 26+1;
			sum = sum + c * 26;
		}
		System.out.println(sum);
		return sum;
	}
}