package leetCode;

public class AddBinary67 {

	public static void main(String[] args) {
		String a = "1010", b = "1010";
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