package pq;

class One1{
	public One1(){
		System.out.print("One,");
	}
}
class Two2 extends One1{
	public Two2(){
		System.out.print("Two,");
	}
}
class Three3 extends Two2{
	public Three3(){
		System.out.print("Three");
	}
}

public class ConstructorChaining {

	public static void main(String[] args){
		Three3 three = new Three3();
	}
}