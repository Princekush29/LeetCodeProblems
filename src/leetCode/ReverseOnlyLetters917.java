package leetCode;

public class ReverseOnlyLetters917 {

	public static void main(String[] args) {
		String s = "z<*zj";
		// o/p j<*zz
		// o/p j-Ih-gfE-dCba
		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String s) {
		char temp;
		char arr[] = s.toCharArray();
		for (int i = s.length() - 1, j = 0; i >= 0 && i > j;) {
			if (!(s.charAt(i) >= 65 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
				i--;
			} else if (!(s.charAt(j) >= 65 && s.charAt(j) <= 90 || s.charAt(j) >= 97 && s.charAt(j) <= 122)) {
				j++;
			} else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i--;
				j++;
			}

		}
		String s1 = String.valueOf(arr);
		System.out.println(s1);
		return s1;
	}
}