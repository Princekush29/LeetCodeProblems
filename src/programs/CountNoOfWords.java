package programs;

public class CountNoOfWords {

	public static void main(String[] args) {
		String s = "One Two   Three    Four";
		String arr[] = s.split(" ");
		System.out.println(arr.length);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}