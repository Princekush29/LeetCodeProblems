package leetCode;

public class Test3 {

	public static void main(String[] args) {
		int A[] = { 4, 1, 2, 3 };
		int A2[] = { 1000000000, 1, 2, 2, 1000000000, 1, 1000000000 };
		int N = A.length;
		int N2 = A2.length;
		int A3[] = { 1, 2, 3, 3, 2, 1, 5 };
		int N3 = A3.length;
		// https://www.assignmenthelp.net/qa/answer/you-are-given-a-record-of-the-historical-prices-of-an-investmen/66f396d7dde7042c5504e2b6
		System.out.println(solution(A, N)); // 6
		System.out.println(solution(A2, N2));// 999999998
		System.out.println(solution(A3, N3));// 7

	}

	public static long solution(int A[], int N) {
		long result = 0;

		for (int i = 1; i < A.length; i++) {
			result = result + Math.max(A[i] - A[i - 1], 0);
		}
		result = result + A[0];
		return (result % 1000000000);
	}
}