package pq;

public class StringToDecimal {
	public static void main(String args[]) {
		String binaryString = "1010";
		int decimal = Integer.parseInt(binaryString, 2);
		int decimal2 = Integer.parseInt(binaryString, 8);
		int decimal3 = Integer.parseInt(binaryString, 10);
		int decimal4 = Integer.parseInt(binaryString, 16);
		System.out.println(decimal);
		System.out.println(decimal2);
		System.out.println(decimal3);
		System.out.println(decimal4);
	}
}

//parseInt(String, radix) converts a String written in the specified base into a Java int.