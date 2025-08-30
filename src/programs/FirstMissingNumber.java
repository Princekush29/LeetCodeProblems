package programs;

public class FirstMissingNumber {

	public static void main(String[] args) {

		int A[] = { 1, 3, 6, 4, 1, 2, 2, 2 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int j;
			for (j = 0; j < A.length; j++) {
				if (i == A[j])
					break;
			}
			if (j == A.length)
				return i;
		}
		return A.length + 1;
	}
}