package programs.String;

import java.util.HashMap;
import java.util.Map;

public class Piramal1 {

	public static void main(String[] args) {
		String s = "abccccddeeeee";
		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		int len = 0;
		boolean flag = true;
		int count = 0;
		for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() % 2 == 0) {
				len = len + hm1.getValue();
			} else {
				if (flag == true && hm1.getValue() == 1) {
					len = len + 1;
					flag = false;
				} else {
					if (hm1.getValue() > 1) {
						len = len + hm1.getValue()-1;
						count = 1;
					}
				}

			}
		}
		if (flag == true && count == 1) {
			len = len + 1;
		}
		System.out.println(len);
	}
}
