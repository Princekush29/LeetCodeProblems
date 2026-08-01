package pq;

class Demo1{
	//constructor
	public Demo1(int i){
		System.out.println("int");
	}

	//method
	public void Demo1(short s){ 
		System.out.println("short");
	}
}

public class ConstructorDemo{

	public static void main(String[] args){
		short s = 10;
		Demo1 demo = new Demo1(s);
	}
}