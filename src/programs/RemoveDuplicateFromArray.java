package programs;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 35, 12, 18,19,10,19};
		// Example output: {30,65,30,19}
		//Method1
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		int k;
		for(Map.Entry<Integer, Integer> hm1:hm.entrySet()) {
			if(hm1.getValue()==1) {
				System.out.println(hm1.getKey());
			}
		}
		//Method2
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		int n = a.length;

		// m will have the maximum element in the array.
		int m = 0;
		for (int i = 0; i < n; i++) {
			m = Math.max(m, a[i]);
		}
		// creating the frequency array
		int[] f = new int[m + 1];

		// incrementing the value at a[i]th index
		// in the frequency array
		for (int i = 0; i < n; i++) {
			f[a[i]]++;
		}
		for (int i = 0; i < m + 1; i++) {

			// if the frequency of the particular element
			// is greater than 0, then print it once
			if (f[i] > 0) {
				System.out.print(i + " ");
			}
		}
	}
}
