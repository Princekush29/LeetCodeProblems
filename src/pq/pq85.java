package pq;
Programming Question 85 What will be the output of the following Java program?

#interviewquestions #interviewtips

public class pq85 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i);
		}
	}
}

Share your view in Comment section 😍

Output is?
1 2 3 4 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
5 6 7 8 9 10
1 2 3 4 5
