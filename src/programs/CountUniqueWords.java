package programs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountUniqueWords {

	public static void main(String[] args) {
		// can be solved using set also
		// Method1 - where length is less than 2
		String s = "Java contains Java multiple libraries and python contains multiple packages";
		int count = 0;
		s= s.replaceAll(" +", " ");
		String arr[] = s.split(" ");
		System.out.println(arr.length);
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		for (Map.Entry<String, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1) {
				System.out.println(hm1.getKey()); 
				count++;
			}
		}
		System.out.println(count);
		
		// Method 2 using set - all words
		System.out.println("-----");
		System.out.println("Method 2 using set");
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}