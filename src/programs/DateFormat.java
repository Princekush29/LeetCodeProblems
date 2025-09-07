package programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println("+++");
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf3.format(c.getTime()));
		int month = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(month);

		Date d4 = new Date();
		System.out.println(d4);
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf1.format(d));
		System.out.println(sd.format(d));
		System.out.println("+++");
		Calendar c2 = Calendar.getInstance();
		System.out.println(c2);
	}
}
