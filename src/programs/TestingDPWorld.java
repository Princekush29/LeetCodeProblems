package programs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestingDPWorld {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		shuffle(arr);
	}

	public static void shuffle(int arr[]) {
		int temp;
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(arr.length);
		int rand_int2 = rand.nextInt(arr.length);

		System.out.println("Random Integers: " + rand_int1);
		System.out.println("Random Integers: " + rand_int2);
		
			temp = arr[rand_int1];
			arr[rand_int1] = arr[rand_int2];
			arr[rand_int2] = temp;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("---");
	}
}