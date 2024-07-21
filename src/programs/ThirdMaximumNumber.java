package programs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		/*
		 * Problem : Given an integer array nums, return the third distinct maximum
		 * number in this array. If the third maximum does not exist, return the maximum
		 * number.*/

		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7 };
		// o/p - 3
		// TreeSet does not preserve the insertion order of elements but elements are
		// sorted by keys

		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println("Set values "+itr.next());
		}

		Object[] arr1 = s.toArray();
		System.out.println("Length is "+arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("O/p is " + arr1[arr1.length - 3]);

	}
}
