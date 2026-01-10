package programs.String;

import java.util.Arrays;

public class AllZeroInStartOrEndInArray {

	public static void main(String[] args) {
		//maintainOrder();
		//zeroFirst();
		maintainOrder1();
		maintainOrder2();
		// orderNotMaintained();
	}

	// method 1 - this will maintain the order also
	// all zero at end
	public static void maintainOrder() {
		int newArray[] = { 1, 0, 3, 0, 4, 0, 5, 0, 0, 1, 2, 3 };
		int insertPos = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != 0)
				newArray[insertPos++] = newArray[i];
		}
		System.out.println(insertPos);
		while (insertPos < newArray.length) {
			newArray[insertPos++] = 0;
		}
		System.out.println("Array is (maintainOrder) " + Arrays.toString(newArray));

	}

	// method1.1 - maintain order - all zero at the start
	public static void zeroFirst() {
		int newArray[] = { 1, 0, 3, 0, 4, 0, 5, 0, 0, 1, 2, 3 };
		int insertPos = newArray.length - 1;

		for (int i = newArray.length - 1; i >= 0; i--) {
			if (newArray[i] != 0) {
				newArray[insertPos--] = newArray[i];
			}
		}
		while (insertPos >= 0) {
			newArray[insertPos--] = 0;
		}
		System.out.println("Array is (zeroFirst) " + Arrays.toString(newArray));
	}

	// Method 2 - all zero at end
	public static void maintainOrder1() {
		int[] arr = { 0, 1, 0, 20, 12 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		System.out.println("maintainOrder1 "+Arrays.toString(arr));
	}

	// Method 2.1 - all zero at start
	public static void maintainOrder2() {
		int[] arr = { 0, 1, 0, 20, 12 };
		int j = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j--;
			}
		}
		System.out.println("maintainOrder2 "+Arrays.toString(arr));
	}

	// none of the below method is maintaining the order
	// Method3
	public static void orderNotMaintained() {
		int arr[] = { 1, 0, 3, 0, 4, 0, 5, 0, 0, 1, 2, 3 };
		int temp = 0;
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (arr[i] != 0)
				i++;
			if (arr[j] == 0)
				j--;
			if (arr[i] == 0 && arr[j] != 0 && i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("+++++++");

		// Method4 - this require creation of another array
		int arr1[] = { 1, 2, 3, 0, 1, 0, 2, 4, 0, 9, 0 };
		int count = 0;
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0)
				count++;
			System.out.println(count);
		}

		for (int i = 0, j = 0; j < arr1.length;) {
			if (arr1[j] != 0) {
				arr2[i] = arr1[j];
				j++;
				i++;

			} else {
				j++;

			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("Method 4 ends");
		
		// Method 5 - Create a array of same length, and if the value is not equal to
		// zero
		// add to the new array and leave other value as the default value will
		// automatically be zero, So only one for loop is required, and not 2 for loop
		// as used in Method 2

		int arr4[] = { 1, 2, 0, 0, 1, 0, 2, 4, 0, 8, 0 };
		int arr3[] = new int[arr4.length];
		for (int i = 0, j = 0; i < arr4.length;) {
			if (arr4[i] != 0) {
				arr3[j] = arr4[i];
				i++;
				j++;
			} else {
				i++;
			}
		}
		System.out.println("Array 5 is " + Arrays.toString(arr3));

	}
}
