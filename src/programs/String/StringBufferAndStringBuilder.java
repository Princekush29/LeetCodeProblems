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

		startTime = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sbf.append("test");
			System.out.println(sbf);
		}
		endTime = System.nanoTime();
		// time for StringBuffer will be always more than StringBuilder
		System.out.println("StringBuffer time:  " + (endTime - startTime));
	}
}
