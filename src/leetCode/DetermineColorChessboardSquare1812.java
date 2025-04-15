package leetCode;

public class DetermineColorChessboardSquare1812 {

	public static void main(String[] args) {

		String coordinates = "c7";
		System.out.println(squareIsWhite(coordinates));

	}

	public static boolean squareIsWhite(String coordinates) {

		// even - white -true
		// odd - black -false
		// A - 97
		// 1 - 49
		char c = coordinates.charAt(0);
		char d = coordinates.charAt(1);
		
		if ((c == 'a' || c == 'c' || c == 'e' || c == 'g') && (d == '1' || d == '3' || d == '5' || d == '7'))
			return false;
		else if ((c == 'b' || c == 'd' || c == 'f' || c == 'h') && (d == '2' || d == '4' || d == '6' || d == '8'))
			return false;
		if ((c == 'a' || c == 'c' || c == 'e' || c == 'g') && (d == '2' || d == '4' || d == '6' || d == '8'))
			return true;
		else if ((c == 'b' || c == 'd' || c == 'f' || c == 'h') && (d == '1' || d == '3' || d == '5' || d == '7'))
			return true;
		
		
		return false;
	}
}
