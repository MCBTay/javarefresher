import java.util.ArrayList;

/*
 * A class where method(s) will be written to print out n numbers of the Fibonacci sequence. 
 * Would like to have both an iterative and recursive solution.
 * 
 * Fibonacci sequence is as follows:
 * 1 1 2 3 5 8 13 21 34 ...
 */
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		fib.FibonacciIterative(1);
		fib.FibonacciIterative(2);
		fib.FibonacciIterative(3);
		fib.FibonacciIterative(5);
		fib.FibonacciIterative(10);
	}
	
	public void FibonacciIterative(int n) {
		if (n <= 0) return;
		
		System.out.println("Printing the first " + n + " numbers in the Fibonacci sequence...");
		ArrayList<Integer> fibNumbers = new ArrayList<Integer>();
		fibNumbers.add(1);
		
		if (n >= 2) {
			fibNumbers.add(1);
			for (int i = 2; i < n; i++) {
				fibNumbers.add(fibNumbers.get(i - 2) + fibNumbers.get(i - 1));
			}
		}
		
		for (int i : fibNumbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
