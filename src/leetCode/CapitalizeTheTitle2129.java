package leetCode;

public class CapitalizeTheTitle2129 {

	public static void main(String[] args) {
		String title = "capiTalIze tHe titLe hello hi byee";
		System.out.println(capitalizeTitle(title));
	}

	public static String capitalizeTitle(String title) {
		/*
		 * String newStr = ""; title = title.toLowerCase(); String[] arr =
		 * title.split(" "); for (int i = 0; i < arr.length; i++) { if (arr[i].length()
		 * > 2) { char c = arr[i].charAt(0); c = (char) (c - 32); newStr = newStr + c;
		 * newStr = newStr + arr[i].substring(1) + " "; } else { newStr = newStr +
		 * arr[i] + " "; } } return newStr.trim();
		 */

		title = title.toLowerCase();
		String arr[] = title.split(" ");
		String newStr = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 2) {
				System.out.println(arr[i].length());
				char c = arr[i].charAt(0);
				String s = (c + "").toUpperCase();
				newStr = newStr + s + arr[i].substring(1) + " ";
			} else {
				newStr = newStr + arr[i] + " ";
			}
		}
		return newStr.trim();
	}
}