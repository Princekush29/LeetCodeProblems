package programs;

public class Currency {

	public static void main(String[] args) {

		int number = 90000000;
		String numString = Integer.toString(number);
		System.out.println(numString.length());
		StringBuilder sb = new StringBuilder();
		String newString = "";
		int count = 0;
		for (int i = numString.length() - 1; i >= 0; i--) {
			char c = numString.charAt(i);
			if (count % 3 == 0 && count != 0) {
				//newString = newString + "," + c;
				//sb.append("," + c);
				sb.append(",");
				sb.append(c);
				count++;
			} else {
				//newString = newString + c;
				sb.append(c);
				count++;
			}
		}
		//System.out.println(newString);
		System.out.println(sb.reverse());
	}
}
