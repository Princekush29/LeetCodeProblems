package leetCode;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String R = "BAABA";
		int A[] = { 2, 4, 1, 1, 2 };
		System.out.println(solution(A, R));
	}

	public static int[] solution(int A[], String R) {
		int arr[] = new int[2];
		int minA = 0, minB = 0;
		int countA = 0, countB = 0;
		for (int i = 0; i < A.length; i++) {
			if (R.charAt(i) == 'B') { // transfer from A to B
				if (!(minA > A[i])) {
					countA = countA + (A[i] - minA);
					minA = A[i];
					minB = minB + A[i];
					minA = minA - A[i];
				} else {
					minB = minB + A[i];
					minA = minA - A[i];
				}
			} else { // transfer from B to A
				if (!(minB > A[i])) {
					countB = countB + (A[i] - minB);
					minB = A[i];
					minA = minA + A[i];
					minB = minB - A[i];
				} else {
					minA = minA + A[i];
					minB = minB - A[i];
				}
			}
		}
		arr[0] = countA;
		arr[1] = countB;
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}