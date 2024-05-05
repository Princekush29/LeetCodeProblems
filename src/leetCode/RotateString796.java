package leetCode;

public class RotateString796 {

	public static void main(String[] args) {
		String s = "aa", goal = "a";

		System.out.println(rotateString(s, goal));
	}

	public static boolean rotateString(String s, String goal) {

		if (s.length() != goal.length())
			return false;
		String s2 = s + s;
		System.out.println(s2);
		if (s2.contains(goal))
			return true;
		return false;
	}
}