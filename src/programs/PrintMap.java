package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class PrintMap {
	public static void main(String[] args) {
		//Map<Character, Integer> tm = new LinkedHashMap<Character, Integer>();
		//Map<Character, Integer> tm = new HashMap<Character, Integer>();
		Map<Character, Integer> tm = new TreeMap<Character, Integer>();
		tm.put('a', 1);
		tm.put('b', 1);
		tm.put('c', 1);
		tm.size();
		//Method1
		System.out.println(tm);
		//Method2
		System.out.println(tm.toString());
		//Method3
		for (Map.Entry<Character, Integer> tm1 : tm.entrySet()) {
			System.out.println(tm1.getKey() + " " + tm1.getValue());
		}
		//Method4
		for (Character tm2 : tm.keySet()) {
			String key = tm2.toString();
			String value = tm.get(tm2).toString();
			System.out.println("Key " + key);
			System.out.println("Value " + value);
		}
		//Method5
		System.out.println(Arrays.asList(tm)); // method 1
		//Method6
		System.out.println(Collections.singletonList(tm)); // method 2
	}
}