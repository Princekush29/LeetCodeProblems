package pq;


class Six{

	public Six(int x){
		System.out.print("int constructor");
	}

	public Six(long l){
		System.out.print("long constructor");
	}
}

public class Constructor{

	public static void main(String[] args){
		long l = 20L;
		Six one = new Six(l);
	}
}