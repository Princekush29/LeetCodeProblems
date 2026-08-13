package pq;

public class ShiftOperatorDemo {
	public static void main(String args[]) {
		byte x = 64;
		int i;
		byte y;
		i = x << 2;
		y = (byte) (x << 2);
		System.out.print(i + " " + y);
	}
}
/*
 * byte x = 64 → binary 01000000; x << 2 shifts left 2 bits, so 64 × 4 = 256.
 * Java promotes byte to int during shift operations, so i = x << 2 gives 256. 
 * y = (byte)(x << 2) converts 256 back to byte; since byte range is -128 to 127,
 * only the lower 8 bits are kept → 0. 
 * Output: 256 0
 
 */