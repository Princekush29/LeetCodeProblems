package leetCode;

public class DayOfTheYear1154 {

	public static void main(String[] args) {
		String date = "2010-09-23";
		System.out.println(dayOfYear(date));
	}

	public static int dayOfYear(String date) {

		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));

		int count = 0;
		for (int i = 0; i < month - 1; i++) 
			count = count + monthDays[i];
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			if (month > 2)
				return count + day + 1;
			else
				return count + day;
		} else {
			return count + day;
		}
	}
}