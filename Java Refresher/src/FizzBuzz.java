/*
 * Print numbers from 1-100.  For numbers that are multiples of 3, print Fizz instead of the number.
 * For numbers that are multiples of 5, print Buzz instead of the number.  For numbers that are multiples
 * of both 3 and 5, print FizzBuzz instead of the number.
 */
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz ");
			else if (i % 3 == 0) System.out.print("Fizz ");
			else if (i % 5 == 0) System.out.print("Buzz ");
			else System.out.print(i + " ");
		}
	}
}
