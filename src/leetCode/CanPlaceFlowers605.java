package leetCode;

public class CanPlaceFlowers605 {

	public static void main(String[] args) {
		int flowerbed[] = { 0 }, n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		if(flowerbed.length>=1 && n<=0)
            return true;
		if(flowerbed.length==1 && flowerbed[0]==0 && n==1)
            return true;
		if(flowerbed.length==1 && n==1)
            return false;
        
		if (flowerbed[0] == 0 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			n--;
		}
		if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
			flowerbed[flowerbed.length - 1] = 1;
			n--;
		}
		 
		for (int i = 1; i < flowerbed.length - 1; i++) {
			if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0 && flowerbed[i] != 1) {
				flowerbed[i] = 1;
				n--;
			}
		}
		if (n > 0)
			return false;

		return true;
	}
}