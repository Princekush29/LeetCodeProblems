package pq;

class One1111{

	public One1111(int x){
		System.out.print("int constructor");
	}

	public One1111(long l){
		System.out.print("long constructor");
	}
}

public class ConstructorOverloadDemo{

	public static void main(String[] args){
		long l = 20L;
		One1111 one = new One1111(l);
	}
}
