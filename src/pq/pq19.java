package pq;

import java.util.Arrays;

public class pq19 {

	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os);
		System.out.println(Arrays.binarySearch(os, "Mac"));
	}
}