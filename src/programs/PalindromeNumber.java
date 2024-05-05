package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 129821, reverseNumber = 0, reminder;
		int originalNum = number;
		while (number != 0) {
			reminder = number % 10;
			reverseNumber = reverseNumber * 10 + reminder;
			number = number/10;	
		}
		if(originalNum == reverseNumber)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("NOT");
		}

	}
}
