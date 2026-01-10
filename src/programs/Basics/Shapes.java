package programs.Basics;

public class Shapes {

	public static void main(String[] args) {
		String str = "then";
		/*
		 * then 
		 * the 
		 * th 
		 * t
		 */
		for (int i = str.length(); i >= 0; i--) {
			System.out.println(str.substring(0, i));
		}
		
		/*
		 * then 
		 * hen 
		 * en 
		 * n
		 */
		
		for(int i=0;i<=str.length();i++) {
			System.out.println(str.substring(i));
		}
	}
}







