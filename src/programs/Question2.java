package programs;
import java.util.HashMap;
import java.util.Map;

public class Question2 {

	public static void main(String[] args) {

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
