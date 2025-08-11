package programs;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Using StringBuilder (Not Thread-Safe):");
		testStringBuilder();

		Thread.sleep(1000); // Pause for clarity

		System.out.println("\nUsing StringBuffer (Thread-Safe):");
		testStringBuffer();
	}

	// Not thread-safe
	public static void testStringBuilder() {
		StringBuilder builder = new StringBuilder();

		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				builder.append(Thread.currentThread().getName()).append(" ");
			}
			System.out.println("Builder Output: " + builder.toString());
		};

		Thread t1 = new Thread(task, "Thread-A");
		Thread t2 = new Thread(task, "Thread-B");

		t1.start();
		t2.start();
	}

	// Thread-safe
	public static void testStringBuffer() {
		StringBuffer buffer = new StringBuffer();

		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				buffer.append(Thread.currentThread().getName()).append(" ");
			}
			System.out.println("Buffer Output: " + buffer.toString());
		};

		Thread t1 = new Thread(task, "Thread-X");
		Thread t2 = new Thread(task, "Thread-Y");

		t1.start();
		t2.start();
	}
}