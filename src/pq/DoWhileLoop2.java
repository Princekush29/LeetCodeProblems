package pq;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		int i = 10;

		while (i < 5) {
			System.out.println("while");
		}

		do {
			System.out.println("do-while");
		} while (i < 5);
	}
}
//Here, the while loop doesn't execute because the condition is false initially, 
//whereas the do-while loop executes once before checking the condition.