package programs.Collections;

import java.util.LinkedList;

public class MiddleElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);
		if (ls.size() % 2 != 0) {
			System.out.println(ls.get(ls.size() / 2));
		} else {
			// when there are even elements, then taking for first value
			System.out.println(ls.get((ls.size() - 1) / 2));
			// when there are even elements, then taking for second value
			System.out.println(ls.get(ls.size() / 2));

		}
	}
}
