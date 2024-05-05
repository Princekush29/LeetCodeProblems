package leetCode;

public class FurthestPointFromOrigin2833 {

	public static void main(String[] args) {
		String moves = "R_";
		System.out.println(furthestDistanceFromOrigin(moves));
	}

	public static int furthestDistanceFromOrigin(String moves) {
		int countL = 0, countR = 0, countDash = 0;
		for (int i = 0; i < moves.length(); i++) {
			char c = moves.charAt(i);
			if (c == 'L') {
				countL++;
			} else if (c == 'R') {
				countR++;
			} else {
				countDash++;
			}
		}
		int count = Math.abs(countL - countR);
		return count + countDash;
	}
}
