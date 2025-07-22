package leetCode;

public class Test {

	public static void main(String[] args) {
		String text = "price$ ppis $high$";
		String result = text.replaceAll("[^p]", "#"); // '$' treated as regex, so needs escaping
		System.out.println(result); // Output: price# is #high#

		String text1 = "price$ is $high$";
		String result1 = text1.replace("$", "#"); // Replaces all literal '$' with '#'
		System.out.println(result1); // Output: price# is #high#

	}
}