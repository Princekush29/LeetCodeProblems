package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecondLargestDigitString1796 {

	public static void main(String[] args) {
		String s = "dfa12321afd";
		System.out.println("Result is " + secondHighest(s));
	}

	public static int secondHighest(String s) {
		Set<Integer> set = new HashSet<Integer>();
		String number = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 47 && s.charAt(i) <= 57)
				number = number + s.charAt(i);
		}
		for (int i = 0; i < number.length(); i++) {
			int m= number.charAt(i);
			System.out.println(" m is "+m);
			//set.add(number.charAt(i));
		}
		System.out.println("Set is "+set);
		int arr[] = new int[set.size()];
		System.out.println("Set is " + set);
		Iterator<Integer> itr = set.iterator();
		int k = 0;
		while (itr.hasNext()) {
			arr[k] = (int) itr.next();
			k++;
		}
		System.out.println("Output is " + Arrays.toString(arr));
		int first = 0, second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
		}
		System.out.println("Second is " + second);
		/*
		 * char p = (char) second; System.out.println("p is "+p); int z=p;
		 * System.out.println("Z is "+z);
		 */
		return (char) second;
	}
}