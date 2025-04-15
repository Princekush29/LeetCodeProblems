package leetCode;

public class CheckOneStringSwapCanMakeStringsEqual1790 {

	public static void main(String[] args) {
		String s1 = "bank", s2 = "kanb";
		System.out.println(areAlmostEqual(s1, s2));
	}

	public static boolean areAlmostEqual(String s1, String s2) {

		if (s1.equals(s2))
			return true;
		if (s1.length() != s2.length())
			return false;
		int count = 0, first = 0, second = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
				if (count == 1)
					first = i;
				if (count == 2)
					second = i;
			}
		}
		char arr[] = s2.toCharArray();
		char c = arr[first];
		arr[first] = arr[second];
		arr[second] = c;

		String s3 = new String(arr);
		if (s3.equals(s1))
			return true;
		return false;
	}
}