package programs.Basics;

public class SharedData {

	static String message = "Hello";

	public static String getMessage() {
		return message;
	}

	public static void updateMessage(String newMsg) {
		message = newMsg;
	}

	public static void main(String[] args) {
		System.out.println(getMessage()); // Hello
		updateMessage("Hi there!");
		System.out.println(getMessage()); // Hi there!
		
	}
}
