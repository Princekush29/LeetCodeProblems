package programs.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapQuestion {

	public static void main(String[] args) {

		// In Java, assigning one object to another (map2 = map1) doesn’t copy the
		// contents—it copies the reference. So any mutation to the object via one
		// reference affects all references to it.

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("value1", 25);
		map1.put("value2", 3);
		Map<String, Integer> map2 = new HashMap<>();
		map2 = map1;
		System.out.println(map1);
		System.out.println(map2);
		map1.put("value3", 42); //
		System.out.println(map1);
		System.out.println(map2);
	}
}
