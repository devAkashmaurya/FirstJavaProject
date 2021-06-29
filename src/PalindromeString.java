import java.util.Scanner;

public class PalindromeString {

	public static void main(String args[])
{
		String input, temp = "";
		Scanner s = new Scanner(System.in);
		String temp2;
		temp2 = s.nextLine();
		input = temp2;
		int length = temp2.length();
		for(int i= length-1; i>=0; i--) {
			temp = temp+temp2.charAt(i);
		}
		if(input.equals(temp)) {
			System.out.println("This is palidrome");
		}else {
			System.out.println("This is not palindrome");
		}
		
		}
	}
