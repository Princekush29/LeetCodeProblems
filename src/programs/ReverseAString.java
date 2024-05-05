package programs;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Hello";
		String newString ="";
		
		for(int i=s.length()-1;i>=0;i--){
			newString = newString+s.charAt(i);
			
		}
		System.out.println(newString);
	}
}

