package leetCode;

public class ThousandSeparator1556 {

	public static void main(String[] args) {

		int n = 1234;
		System.out.println(thousandSeparator(n));
	}

	public static String thousandSeparator(int n) {
		String s = Integer.toString(n);
		int count = 0;
		StringBuilder sb = new StringBuilder();
		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			if (count % 3 == 0 && count != 0) {
				sb.append("."+s.charAt(i));
				count++;
			} else {
				sb.append(s.charAt(i));
				count++;
			}
		}
		//sb.reverse();
		return String.valueOf(sb.reverse());
	}
}
