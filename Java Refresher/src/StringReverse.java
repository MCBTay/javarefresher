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
		reverseWithStringBuffer();
		reverseIteratively();
		reverseRecursively();
	}
	
	public void reverseWithStringBuffer() {
		System.out.println("StringBuffer reverse: " + new StringBuffer(myString).reverse().toString());
	}
	
	public void reverseIteratively() {
		char[] chars = myString.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = myString.length() - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		
		System.out.println("Iterative reverse: " + sb.toString());
	}
	
	public void reverseRecursively() {
		
	}
	
	public static void main (String[] args) {
		StringReverse sr = new StringReverse("My cool string!");
		sr.reverseAllTheWays();
	}
}
