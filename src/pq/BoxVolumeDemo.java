package pq;

class Box1 {
	int width;
	int height;
	int length;
}

public class BoxVolumeDemo {
	public static void main(String args[]) {
		Box1 obj = new Box1();
		obj.width = 10;
		obj.height = 2;
		obj.length = 10;
		int y = obj.width * obj.height * obj.length;
		System.out.print(y);
	}
}
