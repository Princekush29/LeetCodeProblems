package leetCode;

public class SortingTheSentence1859 {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}

	public static String sortSentence(String s) {
		String arr[] = s.split(" ");
		String arr1[] = new String[arr.length];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(arr[i].length() - 1);
			int a = Character.getNumericValue(c);
			String z = arr[i].substring(0, arr[i].length() - 1);
			arr1[a - 1] = z;
		}
		for (int i = 0; i < arr1.length; i++) {
			sb.append(arr1[i]).append(" ");
			// sb.append(arr1[i]);
		}

		return sb.toString().trim();
	}
}