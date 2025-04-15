package leetCode;

public class DecodeString394 {

	public static void main(String[] args) {

		String s = "3[a]2[bc]";
		decodeString(s);
	}

	public static String decodeString(String s) {
		int start=0, end=0;
		String startNumber="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[') {
				start =i;
				startNumber = s.substring(end, i);
				System.out.println(startNumber);
			}
			if(s.charAt(i)==']')
				end =i;
			
			
		}
		
		return s;
	}
}
