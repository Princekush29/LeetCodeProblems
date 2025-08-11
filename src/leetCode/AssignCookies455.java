package leetCode;

import java.util.Arrays;

public class AssignCookies455 {

	public static void main(String[] args) {

		int g[] = { 224, 200, 386, 432, 195, 202, 222, 438, 383, 462, 8, 312, 251, 246, 425 };
		int s[] = { 383, 384, 347, 280, 433, 481, 462, 56, 487, 9, 162, 245, 485, 90, 395 };
		System.out.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {

		int len, count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int child = 0, cookie = 0;
		while (child < g.length && cookie < s.length) {
			if (s[cookie] >= g[child]) {
				child++;
			}
			cookie++;
		}
		return child;
	}
}