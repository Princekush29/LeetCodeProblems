package programs;

public class TestingQ {

	public static void main(String[] args) {

		String s = "Sachin Ramesh Tendulkar";

		s = s.trim();
		System.out.println(s);
		String arr[] = s.split(" ");

		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i].length() > 0) { // 0<=2
				System.out.print(arr[i].charAt(0) + ".");
			} else
				System.out.print(arr[i]);
		}

	}
}