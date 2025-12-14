package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollectionClasses {

	public static void main(String[] args) {
		ArrayList<String> tools = new ArrayList<>();
		tools.add("Selenium");
		tools.add("TestNG");
		tools.add("REST Assured");

		Iterator<String> it = tools.iterator();
		while (it.hasNext()) {
			String tool = it.next();
			System.out.println(tool);
		}
	}
}
