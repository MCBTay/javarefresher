import java.util.HashMap;

/*
 * A method to print all the primes between 1 and n.
 */
public class PrimeNumbers {
	
	public void primesIn(int n) {
		System.out.print("Primes in " + n + ": ");
		// For each number between 1 and n
		for (int i = 2; i < n; i++) {
			int count = 0;
			
			for (int j = 2; j <= i/2; j++) {
				
				if (i % j == 0) {
					count++;
				}
			}
			
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		PrimeNumbers primes = new PrimeNumbers();
		
		primes.primesIn(88);
		primes.primesIn(44);
		primes.primesIn(365);
		primes.primesIn(7);
	}

}
