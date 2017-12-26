/*
 * Class with various implementations of reversing strings
 */
public class StringReverse {
	
	protected String myString;
	
	public StringReverse(String input) {
		myString = input;
	}
	
	public void reverseAllTheWays() {
		reverseWithStringBuffer();
		reverseIteratively();
		reverseRecursively();
	}
	
	public void reverseWithStringBuffer() {
		
	}
	
	public void reverseIteratively() {
		
	}
	
	public void reverseRecursively() {
		
	}
	
	public static void main (String[] args) {
		StringReverse sr = new StringReverse("My cool string!");
		sr.reverseAllTheWays();
	}
}
