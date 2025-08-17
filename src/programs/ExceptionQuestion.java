package programs;

public class ExceptionQuestion {

	public static void main(String args[]) {
		try {
			System.out.print("Hello" + " " + 1 / 0);
		}

		catch (ArithmeticException e) {
			System.out.print("World");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}