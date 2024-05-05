package programs;

public class OverLoadingAndOverRiding {

	public static void main(String[] args) {
		
		//Overloading
		add(10,11);
		add(10,11,12);
	}
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void add(int a, int b, int d) {
		int c = a+b+d;
		System.out.println(c);
	}
}
