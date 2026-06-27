package programs.String;

public class Test1111 {

	public static void main(String... teams) {
		int result = 8;
		outer: while (result > 7) {
			result++;
			do {
				result--;
			} while (result > 5);
			break outer;
		}
		System.out.println(result);
	}
}
