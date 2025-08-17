package programs;

public class Sorting {

	public static void main(String[] args) {

		/*
		 * if(i == 0) ... //if i = 0 this will work and skip the following else-if
		 * statements else if(i == 1) ...//if i not equal to 0 and if i = 1 this will
		 * work and skip the following else-if statement else if(i == 2) ...// if i not
		 * equal to 0 or 1 and if i = 2 the statement will execute
		 * 
		 * if(i == 0) ...//if i = 0 this will work and check the following conditions
		 * also if(i == 1) ...//regardless of the i == 0 check, this if condition is
		 * checked if(i == 2) ...//regardless of the i == 0 and i == 1 check, this if
		 * condition is checked
		 */
		int arr[] = { -20, 10, 20, 25, 30, 25, 25, 35, 40, 40 };
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("MAX IS " + max);
		System.out.println("MIN IS " + min);
//https://www.geeksforgeeks.org/find-second-largest-element-array/
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			// we cannot remove the arr[i]<largest condition in below
			// else if because the array contain duplicate numbers
			else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest is " + largest);
		System.out.println("Second Largest is " + secondLargest);

		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest is " + smallest);
		System.out.println("Second Smallest is " + secondSmallest);

	}
}