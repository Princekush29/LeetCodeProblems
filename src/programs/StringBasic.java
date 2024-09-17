package programs;

public class StringBasic {

	public static void main(String[] args) {
		String s1 ="abc";
		String s2 =s1;
		String s3 =new String("abc");
		String s4 = s1+"def";
		
		System.out.println(s1.equals (s2));// - True
		System.out.println(s1.equals(s3)); //- True
		System.out.println(s1.equals(s4));// - False
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);// - False
		System.out.println(s1==s4);// - False
		System.out.println(s1==s3);// - False	
	}
}
