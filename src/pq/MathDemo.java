package pq;

public class MathDemo {
	public static void main(String[] args) {

		double x = 3.14;

		System.out.println("Original value : " + x);
		System.out.println("Ceil           : " + Math.ceil(x));
		System.out.println("Floor          : " + Math.floor(x));
		System.out.println("Round          : " + Math.round(x));
		double y = 3.5;
		System.out.println("Original value : " + y);
		System.out.println("Ceil           : " + Math.ceil(y));
		System.out.println("Floor          : " + Math.floor(y));
		System.out.println("Round          : " + Math.round(y));

		double x1 = 2.0;
		double y1 = 3.0;
		double z1 = Math.pow(x1, y1);
		System.out.print(z1);
	}
}

/*
Shortcut:
ceil → ⬆️ up
floor → ⬇️ down
round → 🎯 nearest integer

*/