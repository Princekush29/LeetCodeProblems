package pq;

class One11111{

	public One11111(int x){
		System.out.print("int constructor");
	}

	public One11111(long l){
		System.out.print("long constructor");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args){
		long l = 20L;
		One11111 one = new One11111(l);
	}
}