package pq;

public class StaticFieldInitDemo{

	static String name = "Ramesh";

	public StaticFieldInitDemo(){
		name = "Prabhas";
	}

	public static void main(String[] args){
		System.out.println("The name is " + name);
	}
}
