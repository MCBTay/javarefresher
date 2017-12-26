/*
 * Class with various implementations of reversing strings
 */
public class StringReverse {
	
	protected String myString;
	
	public StringReverse(String input) {
		myString = input;
	}
	
	public void reverseAllTheWays() {
		System.out.println("Original string: " + myString);
		System.out.println("StringBuffer reverse: " + reverseWithStringBuffer());
		System.out.println("Iterative reverse: " + reverseIteratively());
		System.out.println("Recursive reverse: " + reverseRecursively());
	}
	
	public String reverseWithStringBuffer() {
		return new StringBuffer(myString).reverse().toString();
	}
	
	public String reverseIteratively() {
		char[] chars = myString.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = myString.length() - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		
		return sb.toString();
	}
	
	public String reverseRecursively() {
		
	}
	
	public static void main (String[] args) {
		StringReverse sr = new StringReverse("My cool string!");
		sr.reverseAllTheWays();
	}
}
