package programs;
import java.util.HashMap;
import java.util.Map;

public class HashMapQuestion {

	public static void main(String[] args) {

		// Java passes object references, not copies. When you assign map2 = map1, you aren't creating a new map; instead, map2 is just another reference to the same object in memory.
		// Changes to map1 are visible in map2. Since they point to the same object, modifications to one affect the other

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("value1", 25);
		map1.put("value2", 3);
		Map<String, Integer> map2 = new HashMap<>();
		map2 = map1;
		System.out.println(map1);
		System.out.println(map2);
		map1.put("value3", 42);
		System.out.println(map1);
		System.out.println(map2);
	}
}
