package programs;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		//Input = "this is name"
		//Output = "name is this"
		String s ="this is name";
		String newStr="";
				
		String arr[]=s.split(" ");
		System.out.println(arr.length-1);
		for(int i=arr.length-1;i>=0;i--) {
			newStr = newStr +arr[i] +" " ;
		}
		System.out.println(newStr);
	}
}
