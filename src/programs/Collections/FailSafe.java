package programs.Collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {

		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		//CopyOnWriteArrayList
		
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			map.put("EIGHT", 5); 
            map.put("SEVEN", 7);
            
		}
	}
}
/*
ConcurrentHashMap iterators are weakly consistent.

They:

✅ Do not throw ConcurrentModificationException.
✅ May reflect modifications made after the iterator is created.
✅ May also ignore those modifications.
❌ Do not guarantee that newly added elements will be visited.
❌ Do not guarantee any iteration order.

Then when should I use ConcurrentHashMap?

Use it when:

Multiple threads read and write the map concurrently.
High performance is important.
You don't need a perfectly consistent snapshot while iterating.

Examples:

Cache implementations
Session management in web applications
User login tracking
Counters and statistics
Thread pools
Producer-consumer systems
*/