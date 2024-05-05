package leetCode;

public class ReformatDate1507 {

	public static void main(String[] args) {
		String date = "6th Jun 1933";
		System.out.println(reformatDate(date));
	}

	public static String reformatDate(String date) {
		String arr[] = date.split(" ");

		String month = "";
		switch (arr[1]) {
		case "Jan":
			month = "01";
			break;
		case "Feb":
			month = "03";
			break;
		case "Mar":
			month = "03";
			break;
		case "Apr":
			month = "04";
			break;
		case "May":
			month = "05";
			break;
		case "Jun":
			month = "06";
			break;
		case "Jul":
			month = "07";
			break;
		case "Aug":
			month = "08";
			break;
		case "Sep":
			month = "09";
			break;
		case "Oct":
			month = "10";
			break;
		case "Nov":
			month = "11";
			break;
		case "Dec":
			month = "12";
			break;
			
		}
		String newDate = "";

		if (arr[0].length() > 3)
			newDate = arr[0].charAt(0) + "" + arr[0].charAt(1);
		else
			newDate = "0" + arr[0].charAt(0);

		return arr[2] + "-" + month + "-" + newDate;

	}
}
