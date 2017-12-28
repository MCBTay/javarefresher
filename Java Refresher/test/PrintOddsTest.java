import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.*;

class PrintOddsTest {
	private PrintOdds testClass;
	private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();


	@BeforeEach
	void setUp() throws Exception {
		testClass = new PrintOdds();
		System.setOut(new PrintStream(stdOutContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		testClass = null;
		System.setOut(null);
	}
	
	@Test
	void testPassingNegativeNumbers() {
		assertThrows(IllegalArgumentException.class,
				()->{
					testClass.print(-50);
	            });
		
		assertThrows(IllegalArgumentException.class,
				()->{
					testClass.print(-1);
				});
		
		assertThrows(IllegalArgumentException.class,
				()->{
					testClass.print(-5);
				});
	}
	
	@Test
	void testPassingZero() {
		assertThrows(IllegalArgumentException.class,
				()->{
					testClass.print(0);
				});
	}
	
	@Test
	void testPassingEleven() {
		int numberOfOdds = testClass.print(11);
		
		assertEquals(6, numberOfOdds);
		assertEquals(" 1 3 5 7 9 11...", stdOutContent.toString());
	}
	
	@Test
	void testPassingFortyEight() {
		int numberOfOdds = testClass.print(48);
		
		assertEquals(24,  numberOfOdds);
		assertEquals(" 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47...", stdOutContent.toString());
	}
}
