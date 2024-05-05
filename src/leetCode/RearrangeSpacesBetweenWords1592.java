package leetCode;

import java.util.ArrayList;
import java.util.Iterator;

public class RearrangeSpacesBetweenWords1592 {

	public static void main(String[] args) {
		String text = "a";
		System.out.println(reorderSpaces(text));
	}

	public static String reorderSpaces(String text) {
		if (text.length() == 1)
			return text;
		int count = 0, words = 0;
		String arr[] = text.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 0) {
				words++;
				al.add(arr[i]);
			}
		}

		System.out.println("Words are " + words);
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				count++;
		}
		System.out.println("Spaces are " + count);
		int endspace = count % (words - 1);
		int space = count / (words - 1);
		String newString = "";
		String newSpace = "";
		String endNewSpace = "";
		System.out.println("End space is " + endspace);
		System.out.println("Space is " + space);
		for (int i = 0; i < space; i++) {
			newSpace = newSpace + " ";
		}
		for (int j = 0; j < endspace; j++) {
			endNewSpace = endNewSpace + " ";
		}
		System.out.println("New Space is " + newSpace);
		Iterator<String> itr = al.iterator();
		int i = 0;
		while (itr.hasNext()) {
			if (i != al.size() - 1) {
				newString = newString + itr.next() + newSpace;
				i++;
			} else {
				newString = newString + itr.next();
				i++;
			}
		}
		return newString + endNewSpace;
	}
}
