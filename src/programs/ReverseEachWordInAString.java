package programs;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String s = "Java Concept Of The Day";
		String arr[] = s.split(" ");
		String arr1[] = new String[arr.length];
		String newStr ="";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length()-1;j>=0;j--) {
				newStr = newStr + arr[i].charAt(j);
			}
			arr1[i] = newStr;
			newStr="";
		}
		
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}
