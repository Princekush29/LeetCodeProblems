package programs;

public class SmallestPostiveIntegerMissing {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 6 };
		int B[] = { 1, 2, 4, 5, 6 };
		System.out.println(solution(A));
		System.out.println(solution(B));
	}

	// Method 1
	public static int solution(int A[]) {

		int n = A.length;
		boolean present[] = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;
		}
		for (int i = 1; i < n + 1; i++)
			if (!present[i])
				return i;
		return n + 1;
	}

	// Method2
	public static int solution1(int B[]) {

		int j = 1;
		for (int i = 0; i < B.length; i++) {
			if (!(B[i] == j))
				return j;
			else {
				j++;
			}
		}
		return 0;
	}
}
