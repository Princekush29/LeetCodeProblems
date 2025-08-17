package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class FindLargestNumberInList {

	public static void main(String[] args) {
		// Method 1
		int arr[] = { 1, 2, 7, 6, 5, 4 };
		int max = 0, newMax = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				max = arr[i];
			if (max > newMax)
				newMax = max;
		}
		System.out.println(newMax);

		// Method2
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		int maximum = al.get(0);
		int arr2[] = new int[al.size()];
		Iterator<Integer> itr = al.iterator();

		for (int i = 0; i < al.size(); i++) {
			if (maximum < al.get(i))
				maximum = al.get(i);
		}
		System.out.println("The maximum number is " + maximum);
	}
}