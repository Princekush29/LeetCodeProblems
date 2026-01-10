package programs.Basics;

public class LeapYear {

	public static void main(String[] args) {

		// The year is multiple of 400 OR
		// The year is a multiple of 4 and not a multiple of 100.
		int year = 2020;

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}