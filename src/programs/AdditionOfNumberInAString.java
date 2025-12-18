package programs;

public class AdditionOfNumberInAString {

	public static void main(String[] args) {
		String s = "12abc13erty14r1";
		// Method1
		String temp = "0", temp1 = "0";
		int sum = 0, sum1 = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c))
				temp += c;
			else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		System.out.println(sum + Integer.parseInt(temp));
		// method2
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 48 && c <= 57) {
				temp1 = temp1 + c;
				//temp1 = temp1 + Character.getNumericValue(c);
			} else {
				sum1 = sum1 + Integer.parseInt(temp1);
				temp1 = "0";
			}
		}
		System.out.println(sum1 + Integer.parseInt(temp1));
	}
}