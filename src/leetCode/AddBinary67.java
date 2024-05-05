package leetCode;

public class AddBinary67 {

	public static void main(String[] args) {
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
				b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println("O " + addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		Long aa = Long.parseLong(a);
		System.out.println("AA is" + aa);
		Long bb = Long.parseLong(b);
		System.out.println("BB is" + bb);
		if (aa == 0 && bb == 0)
			return "0";
		int number1 = binarytoInteger(aa);
		int number2 = binarytoInteger(bb);
		int finalNumber = number1 + number2;
		System.out.println("Final " + finalNumber);
		int remi;
		String s = "";
		while (finalNumber > 0) {
			remi = finalNumber % 2;
			s = Integer.toString(remi) + s;
			finalNumber = finalNumber / 2;

		}
		return s;
	}

	public static int binarytoInteger(Long aa) {
		long reminder = 0;
		int newNumber = 0, i = 0, single = 0;
		while (aa > 0) {
			reminder = aa % 10;
			single = (int) (reminder * Math.pow(2, i));
			newNumber = newNumber + single;
			aa = aa / 10;
			i++;
		}
		return newNumber;
	}
}