package programs;

public class LastWordLength {

	public static void main(String[] args) {
		String str1 = " fly me  to  the moon  ";
		str1 = str1.trim();
		System.out.println(str1);
		System.out.println("++");
		str1 = str1.replaceAll(" +", " ");
		System.out.println(str1);
		String arr[] = str1.split(" ");
		System.out.println(arr[arr.length - 1].length());
	}
}
