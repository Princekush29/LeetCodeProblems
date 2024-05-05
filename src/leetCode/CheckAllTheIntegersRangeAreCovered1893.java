package leetCode;

public class CheckAllTheIntegersRangeAreCovered1893 {

	public static void main(String[] args) {

		int ranges[][] = { { 1, 10 }, { 10, 20 } };
		int left = 21, right = 21;
		System.out.println(isCovered(ranges, left, right));

	}

	public static boolean isCovered(int[][] ranges, int left, int right) {
		int starting = ranges[0][0];
		System.out.println("Starting " + starting);
		int ending = ranges[ranges.length - 1][ranges[0].length - 1];
		System.out.println("Ending " + ending);

		if (left > starting && right < ending)
			return true;
		return false;
	}
}
