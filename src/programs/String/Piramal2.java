package programs.String;

import java.util.HashMap;
import java.util.Map;

public class Piramal2 {

	public static void main(String[] args) {
		System.out.println(test());
	}

	public static boolean test() {
		//String s = "badc", t = "baba";
		String s = "badc", t = "baba";
		Map<Character, Character> hm = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				if (!(hm.get(s.charAt(i)) == t.charAt(i)))
					return false;
			} else {
				hm.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}
}
