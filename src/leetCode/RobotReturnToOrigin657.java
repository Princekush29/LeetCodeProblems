package leetCode;

public class RobotReturnToOrigin657 {

	public static void main(String[] args) {
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}

	public static boolean judgeCircle(String moves) {
		int up = 0, down = 0, right = 0, left = 0;
		for (int i = 0; i < moves.length(); i++) {
			char c = moves.charAt(i);
			switch (c) {
			case 'U':
				up++;
				break;
			case 'D':
				down++;
				break;
			case 'L':
				left++;
				break;
			case 'R':
				right++;
				break;
			}
		}
		if (left - right == 0 && up - down == 0)
			return true;
		return false;

	}
}
