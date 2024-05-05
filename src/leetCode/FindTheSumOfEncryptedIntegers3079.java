package leetCode;

public class FindTheSumOfEncryptedIntegers3079 {

	public static void main(String[] args) {
		int nums[] = { 1,2,3 };
		System.out.println(sumOfEncryptedInt(nums));
	}

	public static int sumOfEncryptedInt(int[] nums) {

		int reminder = 0, a, number = 0, sum = 0, count=0, b, multiplyNumber = 0;
		for (int i = 0; i < nums.length; i++) {
			a = nums[i];
			while (a != 0) {
				count++;
				reminder = a % 10;
				if (reminder > number)
					number = reminder;
				a = a / 10;
			}
			if(count==1)
				multiplyNumber=1;
			if(count==2)
				multiplyNumber=11;
			if(count==3)
				multiplyNumber=111;
			
			sum = sum + multiplyNumber * number;
			number = 0;
			count=0;
		}
		return sum;

	}
}
