package programs;

public class Test {

	public static void main(String[] args) {

		long currentTime = System.nanoTime();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			sb.append("test");
			System.out.println(sb);
		}
		long endTime = System.nanoTime();
		System.out.println("StringBuffer time is " + (endTime - currentTime));

		long currentTime1 = System.nanoTime();

		StringBuilder si = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			si.append("test");
			System.out.println(si);
		}
		long endTime1 = System.nanoTime();
		System.out.println("StringBuffer time is " + (endTime - currentTime));

		System.out.println("StringBuilder time is " + (endTime1 - currentTime1));
	}
}