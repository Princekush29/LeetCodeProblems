package pq;
Programming Question 97 What will be the output of the following Java program?

#interviewquestions #interviewtips

public class pq97 {
	public static void main(String args[]) {

		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
	}
}

Share your view in Comment section 😍

Output is?
1
0
false
true
