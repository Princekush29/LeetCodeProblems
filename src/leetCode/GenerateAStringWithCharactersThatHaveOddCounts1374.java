package leetCode;

public class GenerateAStringWithCharactersThatHaveOddCounts1374 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(generateTheString(n));
	}

	public static String generateTheString(int n) {
		String str = "";
		if (n % 2 == 0) {
			for (int i = 0; i < n - 1; i++) {
				str = str + "a";
			}
			str = str + "b";
		}else {
			while(n!=0) {
				str=str+"a";
				n--;
			}
		}
		return str;
	}
}
