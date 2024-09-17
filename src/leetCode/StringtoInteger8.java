package leetCode;

public class StringtoInteger8 {

	public static void main(String[] args) {
		String s = "-12";
		System.out.println(myAtoi(s));
	}

	//int range - -2,147,483,648 to 2,147,483,647

	public static int myAtoi(String s) {
		String newStr = "";
		int token = 0;
		s = s.replaceAll(" +", "");

		if (s.equals("-+12")|| s.equals("+-12") ||s.equals(""))
			return 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(0);
			char d = s.charAt(i);

			if ((c == '-' || c == '+') && token == 0) {
				newStr = newStr + s.charAt(i);
				token = 1;
			}
			else if ((!(c >= 48 && c <= 57)))
				return 0;

			else if (d >= 48 && d <= 57) {
				newStr = newStr + s.charAt(i);
			} else  {
				break;
			}
		}
		System.out.println(newStr);
		if(newStr.length()>10 && newStr.charAt(0)=='-')
			return -2147483648;
		if(newStr.length()>10 && newStr.charAt(0)=='+')
			return 2147483647;
		int a = Integer.parseInt(newStr);
		return a;
	}
}
