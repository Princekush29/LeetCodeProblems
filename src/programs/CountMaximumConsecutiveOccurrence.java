package programs;

public class CountMaximumConsecutiveOccurrence {

	public static void main(String[] args) {
		int count = 0, newCount = 0;
		int input[] = { 1, 1, 2, 3, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			if (count > newCount) {
				newCount = count;
			}
		}
		System.out.println(newCount);
	}
}