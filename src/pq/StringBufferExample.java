package pq;

public class StringBufferExample {

	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2.toString()));

	}
}

