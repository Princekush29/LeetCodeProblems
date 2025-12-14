package programs;

public class GetAllSubString {

	public static void main(String[] args) {
		String str = "abcd";
		int len = str.length();

		// Method1 - Using only one for loop+
		for (int i = 0, j = i + 1; i <= len && j <= len; j++) {
			System.out.println(str.substring(i, j));
			if (j == len) {
				i++;
				j = i;
			}
		}
		System.out.println("+++");
		// Method2
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				System.out.println(str.substring(i, j));
			}
		}
		System.out.println("+++++");
		// Method3
		for (int i = 0; i < len; i++) {
			String newStr = "";
			for (int j = i; j < len; j++) {
				newStr = newStr + str.charAt(j);
				System.out.println(newStr);
			}
		}
	}
}