package leetCode;

public class CountTestedDevicesAfterTestOperations2960 {

	public static void main(String[] args) {
		int batteryPercentages[] = { 2,2,2 };
		System.out.println(countTestedDevices(batteryPercentages));
	}

	public static int countTestedDevices(int[] batteryPercentages) {
		int count = 0;
		for (int i = 0; i < batteryPercentages.length; i++) {
			int j = i + 1;
			if (batteryPercentages[i] > 0) {
				count++;
				while (j != batteryPercentages.length) {
					batteryPercentages[j] = batteryPercentages[j] - 1;
					j++;
				}
			}
		}

		return count;
	}
}
