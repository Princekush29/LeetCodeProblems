package programs;

import java.util.LinkedList;

public class MiddleElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(10);
		// ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.get(ls.size() / 2));
	}
}
