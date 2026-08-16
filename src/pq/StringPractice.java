package pq;

public class StringPractice {
	public static void main(String args[]) {
		String s111 = "1234";
		int num = Integer.parseInt(s111);
		System.out.println(num);
		
		String str23 = "hello";
		//String s123 = str23.charAt(0);
		//System.out.println(s123);
		
		String[] strings = new String[2];
		System.out.println(strings);
		
		String c = "Hello, How are you ?";
		boolean var;
		var = c.startsWith("hello");
		System.out.println(var);

		System.out.println("+++");
		String str = null;
		System.out.println(str.valueOf(10));
		
		System.out.println("+++");
		char chars[] = { 'a', 'b', 'c' };
		String s = new String(chars);
		System.out.println(s);
		
		System.out.println("+++");
		String str1 = "one";
		String str2 = "two";
		System.out.println(str1.concat(str2));
		

		String str22 = "Hellow";
		System.out.println(str22.indexOf('t'));
		
		String str121 = "Hello";
		str121 += " World!";
		System.out.println(str121.length());
		
		String str222 = "Java";
		str222.concat(" Programming");
		System.out.println(str222);
		
		String str12 = "Java";
		String str21 = "Java";
		String str3 = new String("Java");

		System.out.println(str12.equals(str21) && str1.equals(str3));
		
		int Integer = 24;
		char String = 'I';
		System.out.print(Integer);
		System.out.print(String);

	}
}