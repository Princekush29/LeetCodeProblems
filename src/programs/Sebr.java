package programs;

public class Sebr {

	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static String getStatus() throws InterruptedException {
		Thread.sleep(11000);
		return "SUCCESS";

	}

	public static String test() throws InterruptedException {

		long startTime = System.currentTimeMillis();
		long currentTime = 0;

		System.out.println(startTime);
		System.out.println(currentTime);
		while ((currentTime - startTime) < 10000) {
			String status = getStatus();// SUCESS, FAILURE, NOTPROCESSED
			//System.out.println("Status is " + status);

			if (status.equals("SUCCESS")) {
				return status;
			}

			Thread.sleep(3000);
			currentTime = System.currentTimeMillis();
			System.out.println("CURRENT TIME IS " + currentTime);
			System.out.println(currentTime - startTime);
		}
		return null;
	}
}