package programs;

public class AllZeroInStartingInString {
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

		System.out.println("-----Method 2-----");
		test();
	}

	// Method2
	public static void test() {
		String str = "324002010";
		char arr[] = str.toCharArray();
		char temp;
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (arr[i] != '0') {
				i++;
			} else if (arr[j] == '0') {
				j--;
			} else if (arr[i] == '0' && arr[j] != '0' && i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(arr);
	}
}