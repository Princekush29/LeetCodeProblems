package pq;

public class StringConcatenationExample {
	public static void main(String args[]) {
		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);

		String str = "Hello";
		str += " World!";
		System.out.println(str);
		System.out.println(str.length());
		
		String s1 = new String("5");
		System.out.println(1 + 10 + s1 + 1 + 10);
	}
}