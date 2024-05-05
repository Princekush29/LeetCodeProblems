package leetCode;

public class StudentAttendanceRecordI551 {

	public static void main(String[] args) {
		String s = "PPALLL";
		System.out.println("Hello");
		System.out.println(checkRecord(s));
	}

	public static boolean checkRecord(String s) {
		char c;
		int count = 0, countLate = 0;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == 'A')
				count++;
			if (count > 2)
				return false;
		}
		char c1[] = s.toCharArray();

		for (int i = 0; i < s.length() - 2; i++) {
			if (c1[i] == 'L' && c1[i + 1] == 'L' && c1[i + 2] == 'L')
				countLate = 1;
		}
		if (count < 2 && countLate == 0)
			return true;

		return false;
	}
}
