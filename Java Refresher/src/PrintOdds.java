/*
 * Class with implementation to print all odd numbers between 1 and a specified number
 */
public class PrintOdds {

	public int print(int n)
	{
		int numOdds = 0;
		if (n < 1) throw new IllegalArgumentException("Arguments must be non-zero and positive.");
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				numOdds++;
				System.out.print(" " + i);
			}
		}
		System.out.print("...");
		
		return numOdds;
	}
	
	public static void main(String[] args) {
		PrintOdds odds = new PrintOdds();
		int numOdds = 0;
		
		System.out.println("Printing odds between 1 and 99: ");
		numOdds = odds.print(99);
		System.out.println(numOdds + " total");
		
		System.out.println("Printing odds between 1 and 1: ");
		numOdds = odds.print(1);
		System.out.println(numOdds + " total");
		
		System.out.println("Printing odds between 1 and 35: ");
		numOdds = odds.print(35);
		System.out.println(numOdds + " total");
		
		System.out.println("Printing odds between 1 and 16: ");
		numOdds = odds.print(16);
		System.out.println(numOdds + " total");
	}

}
