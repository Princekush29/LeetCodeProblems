package programs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicate {

	public static void main(String[] args) {
		int arr[] = {10, 20, 25, 30, 25, 25, 35, 40, 40};
		int size;
		size = arr.length;
		System.out.println(size);

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("Method 1");
		System.out.println(hm);
		
		System.out.println("Method 2");
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() > 1)
				System.out.println(hm1.getKey());
		}
		System.out.println("Method 3");
		Iterator<Integer> itr = hm.keySet().iterator();
		Iterator<Integer> itr1 = hm.values().iterator();
		while (itr.hasNext() && itr1.hasNext()) {
			System.out.println(itr.next() + " " + itr1.next());
		}
		
		System.out.println("Method 4");
		Iterator<Entry<Integer, Integer>> itr3 = hm.entrySet().iterator(); 
        
        while(itr3.hasNext()) 
        { 
             Entry<Integer, Integer> entry = itr3.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 

	}
}