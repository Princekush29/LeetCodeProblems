package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle118 {

	public static void main(String[] args) {
		int numRows = 2;
		System.out.println(generate(numRows));
	}

	public static List<List<Integer>> generate(int numRows) {

		List<Integer> l = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<>();

		if (numRows == 2) {
			list.add(Arrays.asList(1));
		}
		l.clear();
		if (numRows == 2) {
			l.add(1);
			l.add(1);
			list.add(Arrays.asList(1));
		}

		System.out.println(l);
		return list;
	}
}
