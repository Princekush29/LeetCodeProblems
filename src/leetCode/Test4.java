package leetCode;

import java.util.Arrays;

public class Test4 {

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
		/*
		 * int arr[] = new int[2]; int balanceA = 0, balanceB = 0, valueA = 0, valueB =
		 * 0; for (int i = 0; i < R.length(); i++) { if (R.charAt(i) == 'A') // transfer
		 * from bank B to bank A { if (!(balanceB > A[i])) { valueB = valueB + (A[i] -
		 * balanceB); balanceB = 0; balanceA = balanceA + A[i]; //balanceB = balanceB -
		 * A[i]; } else { balanceA = balanceA + A[i]; balanceB = balanceB - A[i]; } }
		 * else { // transfer from bank B to bank A if (!(balanceA > A[i])) { valueA =
		 * valueA + (A[i] - balanceA); balanceA = 0; balanceB = balanceB + A[i];
		 * //balanceA = balanceA - A[i]; } else { balanceB = balanceB + A[i]; balanceA =
		 * balanceA - A[i]; } } } arr[0] = valueA; arr[1] = valueB;
		 * System.out.println(Arrays.toString(arr)); return arr;
		 */
		int balanceA = 0;
		int balanceB = 0;
		int minBalanceA = 0;
		int minBalanceB = 0;

		for (int i = 0; i < R.length(); i++) {
			if (R.charAt(i) == 'A') { // transfer from B to A
				balanceA += A[i];
				balanceB -= A[i];
			} else {
				balanceA -= A[i];
				balanceB += A[i];
			}

			minBalanceA = Math.min(minBalanceA, balanceA);
			minBalanceB = Math.min(minBalanceB, balanceB);
		}
		System.out.println(minBalanceA);
		System.out.println(minBalanceB);
		return new int[] { -minBalanceA, -minBalanceB };
	}
}