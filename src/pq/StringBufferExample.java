package pq;

public class StringBufferExample {

	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2.toString()));
		
		StringBuffer sb = new StringBuffer("include");
	    sb.append("help");
	    System.out.println(sb);
	    
	    StringBuffer sb1 = new StringBuffer("include");
	    sb1.append("help");
	    System.out.println(sb1);
	    
	    String ss = "abc";
		StringBuffer s22 = new StringBuffer(ss);
		System.out.println(s1.equals(s22));

	}
}