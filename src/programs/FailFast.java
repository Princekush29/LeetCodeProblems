package programs;

import java.util.ArrayList;
import java.util.Iterator;

class FailFast {
	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(10);
		al.add(10);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			al.add(20);
		}
	}
}