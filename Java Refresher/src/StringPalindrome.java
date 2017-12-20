/**
 * A class where method(s) will be written to determine if a given string is a palindrome
 * or not.  Ideally I'd like to solve it both iteratively and recursively.
 */
public class StringPalindrome {
	
	public static void main(String[] args) {
		
		StringPalindrome sp = new StringPalindrome();
		
		sp.IsPalindromeIterative("lololol");
		sp.IsPalindromeIterative("bobby");
		sp.IsPalindromeIterative("racecar");
		sp.IsPalindromeIterative("grapes");
	}
	
	public boolean IsPalindromeIterative(String input) {
		System.out.print("Checking to see if " + input + " is a palindrome iteratively...");
		char[] inputChars = input.toCharArray();
		
		int left = 0;
		int right = inputChars.length - 1;
		
		while (right > left)
		{
			if (inputChars[left] != inputChars[right]) {
				System.out.println("It isn't!");
				return false;
			}
			left++;
			right--;
		}
		System.out.println("It is!");
		return true;
	}
}
