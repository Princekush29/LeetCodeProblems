package programs;

public class AllZeroInStarting {
	public static void main(String[] args) {
		// Method 1
		String str = "324002010";
		String newStr1 = "", newStr2 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '0') // if(c==48) - using ASCII value
				newStr1 = newStr1 + c;
			else
				newStr2 = newStr2 + c;
		}
		System.out.println(newStr1 + newStr2);
		
		// Method 2 - It should be in range of int
		int num = Integer.parseInt(str);
		System.out.println("Num is " + num);
		int reminder;
		StringBuilder newNum2 = new StringBuilder() ;
		String newNum1 = "";
		while (num > 0) {
			reminder = num % 10;
			if (reminder == 0) {
				newNum1 = newNum1 + "0";
			} else {
				newNum2 = newNum2.append(reminder);
			}
			num = num / 10;
		}
		System.out.println(newNum1 + newNum2.reverse());
	}
}