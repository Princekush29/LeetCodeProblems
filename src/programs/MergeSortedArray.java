package programs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 4 };
		int arr2[] = { 4, 5, 6, 7 };
		int m=3,n=2;
		Set<Integer> s = new HashSet<Integer>();
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		int arr3[] = new int[m+n];
		System.out.println(arr3.length);
		
		for (int i = 0; i < m; i++) {
			arr3[i] = arr1[i];
			s.add(arr1[i]);
		}
		int arrLength = arr1.length;
		
		for (int i = 0; i < n; i++, m++) {
			arr3[m] = arr2[i];
			s.add(arr2[i]);

		}
		//Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("ddd");
		System.out.println(s);
		System.out.println("ssss");
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("aaaa");
		for(Integer f:s)
		{
			System.out.println(f);
		}
	}
}
