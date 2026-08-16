package pq;

public class ByteOverflow {

	public static void main(String[] args) {

			byte x = 127;
			x++;
			x++;
			System.out.print(x);
	}
}