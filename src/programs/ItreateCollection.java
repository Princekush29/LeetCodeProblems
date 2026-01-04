package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItreateCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");list.add("Vijay");list.add("Ravi");list.add("Ajay");

		System.out.println("Method 1 : Traversing list through iterator interface:");
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	
		System.out.println("Method 2 : Traversing list through for each loop:");
		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("Method 3 : Traversing list through List Iterator:");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Method 4 : Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Method 5 : Traversing list through forEach() method:");
		list.forEach(a -> System.out.println(a));
		
		System.out.println("Method 6 : Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});
	}
}
