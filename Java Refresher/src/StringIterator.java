/* 
 * Class to iterate over a string and spit out each character one by one.
 */
public class StringIterator {

	public void iterate(String input) {
		for (int i = 0, n = input.length(); i < n; i++) {
			System.out.println(i + ": " + input.charAt(i));
		}
	}
	
	public static void main (String[] args) {
		StringIterator si = new StringIterator();
		
		si.iterate("my cool string");
		si.iterate("Bryan");
		si.iterate("Winter is coming...");
	}
}
