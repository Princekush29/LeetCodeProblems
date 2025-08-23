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
	}
}