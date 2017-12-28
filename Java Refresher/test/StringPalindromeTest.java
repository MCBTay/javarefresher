import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPalindromeTest {
	private StringPalindrome testClass;
	
	@BeforeEach
	void setUp() throws Exception {
		testClass = new StringPalindrome();
	}

	@AfterEach
	void tearDown() throws Exception {
		testClass = null;
	}

	@Test
	void testIsPalindromeIterativeWithPalindromes() {
		assertTrue(testClass.IsPalindromeIterative("lololol"));
		assertTrue(testClass.IsPalindromeIterative("racecar"));
		assertTrue(testClass.IsPalindromeIterative("RACEcar"));
	}
	
	@Test
	void testIsPalindromeIterativeWithNonPalindromes() {
		assertFalse(testClass.IsPalindromeIterative("bobby"));
		assertFalse(testClass.IsPalindromeIterative("grapes"));
		assertFalse(testClass.IsPalindromeIterative("Clemson"));
	}

}
