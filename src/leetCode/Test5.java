package leetCode;

public class Test5 {

	public static void main(String[] args) {
		String R = "BAABA";
		String R2 = "ABAB";
		String R3 = "B";

		int A[] = { 2, 4, 1, 1, 2 }; // [2,4]
		int A2[] = { 10, 5, 10, 15 };// [0,15]
		int A3[] = { 100 }; // [100,0]
		System.out.println(solution(A, R));
		System.out.println(solution(A2, R2));
		System.out.println(solution(A3, R3));
	}

	public static int[] solution(int A[], String R) {
		int minA = 0, minB = 0, countA = 0, countB = 0;
		for (int i = 0; i < R.length(); i++) {

			if (R.charAt(i) == 'A') // sending from B to A
			{
				minB = minB - A[i];
				minA = minA + A[i];
			} else {
				minA = minA - A[i];
				minB = minB + A[i];
			}
			countA = Math.min(countA, minA);
			countB = Math.min(countB, minB);
		}
		System.out.println(-countA);
		System.out.println(-countB);
		return A;

	}
}