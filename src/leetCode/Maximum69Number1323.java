package leetCode;

public class Maximum69Number1323 {

	public static void main(String[] args) {
		System.out.println(maximum69Number(9669));
	}

	public static int maximum69Number(int num) {

		String str = Integer.toString(num);
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '6') {
				c[i] = '9';
				break;
			}
		}

		return Integer.parseInt(new String(c));
	}
}
