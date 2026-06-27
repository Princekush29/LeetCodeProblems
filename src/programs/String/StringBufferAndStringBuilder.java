package programs.String;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append("test");
			System.out.println(sb);
		}
		long endTime = System.nanoTime();
		System.out.println("StringBuilder time: " + (endTime - startTime));

		long startTime1 = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sbf.append("test");
			System.out.println(sbf);
		}
		long endTime1 = System.nanoTime();
		// time for StringBuffer will be always more than StringBuilder
		System.out.println("StringBuffer time:  " + (endTime1 - startTime1));
		System.out.println("StringBuilder time: " + (endTime - startTime));

	}
}
