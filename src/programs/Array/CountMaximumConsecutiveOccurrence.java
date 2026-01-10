package programs.Array;

public class CountMaximumConsecutiveOccurrence {

	public static void main(String[] args) {
		// count maximum occurrence of 1 in an array
		int count = 0, newCount = 0;
		int input[] = { 1, 1, 2, 3, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			// we can use either below if condition or Math.max
			if (count > newCount) {
				newCount = count;
			}

			// newCount = Math.max(count, newCount);
		}
		System.out.println(newCount);
		System.out.println("+++");
	}

}
