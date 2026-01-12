package programs.Basics;

class ExceptionParentChild {
	void show() {
		System.out.println("Parent method");
	}
}

class ChildClassException extends ExceptionParentChild {
	// This is allowed: unchecked exception

	@Override
	void show() throws ArithmeticException {
		System.out.println("Child method");
		throw new ArithmeticException("Oops!");
	}

	// This is NOT allowed:checked exception

	/*
	 * // @Override 
	 * void show() throws IOException {
	 * System.out.println("Child method"); throw new IOException("Not allowed!"); }
	 */
}