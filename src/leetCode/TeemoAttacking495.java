package leetCode;

public class TeemoAttacking495 {

	public static void main(String[] args) {
		int timeSeries[] = { 1, 2 }, duration = 2;
		System.out.println(findPoisonedDuration(timeSeries, duration));
	}

	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		int count = 0;
		for (int i = 0; i < timeSeries.length - 1; i++) {
			if (timeSeries[i + 1] <= timeSeries[i] + duration - 1)
				count = count + timeSeries[i + 1] - timeSeries[i];
			else
				count = count + duration;
		}
		count = count + duration;
		return count;

	}
}
