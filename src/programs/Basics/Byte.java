package programs.Basics;

public class Byte {

	public static void main(String[] args) {

		byte a = (byte) 128;
		a = (byte) (a + 1);
		System.out.println(a);

		// int range -2,147,483,648 to 2,147,483,647
		int abc = 2147483647;
		System.out.println(abc + 1);

		byte c = 127;
		System.out.println(c + 2); // 129
		/*
		 * Integer Promotion In Java, whenever you perform an arithmetic operation (like
		 * +) on a byte, short, or char, the operands are automatically promoted to int
		 * (32-bit) before the calculation happens.
		 */
	}

}