package leetCode;

public class LemonadeChange860 {

	public static void main(String[] args) {
		// int bills[] = { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20,
		// 5 };
		// int bills[] = { 5, 5, 10, 10, 20 };
		int bills[] = { 5, 5, 20, 5, 10, 20, 20, 5, 20, 20 };
		// int bills[] = { 10,10};
		// int bills[] = { 5, 5, 5, 10, 5, 5, 10, 20, 20, 20 };
		System.out.println(lemonadeChange(bills));
	}

	public static boolean lemonadeChange(int[] bills) {
		int count5 = 0, count10 = 0, count20 = 0, change = 0, giveBack;
		for (int i = 0; i < bills.length; i++) {
			int a = bills[i];
			if (bills[i] == 5)
				count5++;
			else if (bills[i] == 10) {
				count10++;
				count5--;
			} else if (bills[i] == 20) {
				{
					if (count10 >= 1 && count5 >= 1) {
						count5--;
						count10--;
					} else if (count10 >= 1 && count5 <= 0) {
						return false;
					} else if (count5 >= 3)
						count5 = count5 - 3;
					else if ((count5 == 1 || count5 == 2) && count10 <= 0)
						return false;
					else if (count5 == 0 && count10 == 0)
						return false;
				}
			}
			if (count5 < 0 || count10 < 0)
				return false;
		}
		if (count5 < 0 || count10 < 0)
			return false;
		return true;
	}

}
