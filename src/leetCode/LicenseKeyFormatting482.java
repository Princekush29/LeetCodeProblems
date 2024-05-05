package leetCode;

public class LicenseKeyFormatting482 {
	public static void main(String[] args) {
		String s = "5F3Z-2e-9-w";
		int k = 4;
		System.out.println(licenseKeyFormatting(s, k));
	}

	public static String licenseKeyFormatting(String s, int k) {

		s = s.replace("-", "").toUpperCase();
		String newStr = "";
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
			newStr = newStr + s.charAt(i);
			counter++;
			if (counter % k == 0 && i != 0) {
				sb.append("-");
				newStr = newStr + "-";
			}
		}
		System.out.println("String is " + newStr);
		System.out.println(sb);
		return sb.reverse().toString();
	}
}