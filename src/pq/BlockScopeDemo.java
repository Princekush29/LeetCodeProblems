package pq;
public class BlockScopeDemo {
	public static void main(String args[]) {
		int x;
		x = 5;
		{
			int y = 6;
			System.out.print(x + " " + y);
		}
		// y = 10; // Error: y cannot be resolved to a variable
		//System.out.println(x + " " + y);
	}
}
