package pq;

public class DoWhile {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i < 5);
	}
}

/*
Unlike a while loop, which checks the condition before executing, a do-while loop:
- Executes the block first
- Then checks the condition
- Repeats if the condition is true
*/