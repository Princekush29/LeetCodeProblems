package programs;

public class ExceptionProgram {

	public static void main(String[] args) {

		System.out.println("111");
		System.out.println("222");
		System.out.println("333");

		int a = 10, b = 0;

		try {
			int c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}

		System.out.println("444");
		System.out.println("555");
		System.out.println("666");
		System.out.println("777");
	}
}
