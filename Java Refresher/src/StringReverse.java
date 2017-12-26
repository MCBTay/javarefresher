/*
 * Class with various implementations of reversing strings
 */
public class StringReverse {

	public void reverseAllTheWays(String input) {
		System.out.println("Original string: " + input);
		System.out.println("StringBuffer reverse: " + reverseWithStringBuffer(input));
		System.out.println("Iterative reverse: " + reverseIteratively(input));
		System.out.println("Recursive reverse: " + reverseRecursively(input));
	}
	
	public String reverseWithStringBuffer(String input) {
		return new StringBuffer(input).reverse().toString();
	}
	
	public String reverseIteratively(String input) {
		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		
		return sb.toString();
	}
	
	public String reverseRecursively(String input) {
		if (input.length() < 2) return input;
		
		return reverseRecursively(input.substring(1)) + input.charAt(0);
	}
	
	public static void main (String[] args) {
		StringReverse sr = new StringReverse();
		sr.reverseAllTheWays("My cool string!");
		sr.reverseAllTheWays("Bryan Taylor");
	}
}
