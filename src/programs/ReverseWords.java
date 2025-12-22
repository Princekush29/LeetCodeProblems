package programs;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "Hello how are you";

		String arr[] = s.split(" ");
		String newStr = "";

		// Q1 : you are how Hello
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("---");
		
		// Q2: uoy era woh olleH
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				newStr = newStr + arr[i].charAt(j);
			}
			System.out.print(newStr + " ");
			newStr = "";
		}
		System.out.println("----------");

		// Q3: olleH woh era uoy 
		String newStr1 = "";
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				newStr1 = newStr1 + arr[i].charAt(j);
			}
			System.out.print(newStr1 + " ");
			newStr1 = "";
		}
	}
}