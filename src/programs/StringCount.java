package programs;
import java.util.HashSet;

public class StringCount {

	public static void main(String[] args) {

		String s = "Java contains multiple libaries and python contains multiple packages";
		// words =9
		// unique words = 7
		String arr1[] = s.split(" ");
		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		System.out.println(hs.size());
	}
}