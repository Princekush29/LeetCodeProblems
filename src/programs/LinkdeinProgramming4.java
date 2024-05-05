/*
	 * Code-70 | Java Problem : You are given a 0-indexed array mountain. Your task
	 * is to find all the peaks in the mountain array. Return an array that consists
	 * of indices of peaks in the given array in any order.
	 */

//o/p - Indices of element greater than their neighboring element - 1 & 3
package programs;


public class LinkdeinProgramming4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 5 };
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int i=0;
		for ( i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
				return i;	
			}
		}
		return -1;
	}
}