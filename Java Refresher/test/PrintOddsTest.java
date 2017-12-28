import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintOddsTest {
	private PrintOdds testClass;

	@BeforeEach
	void setUp() throws Exception {
		testClass = new PrintOdds();
	}

	@AfterEach
	void tearDown() throws Exception {
		testClass = null;
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
}
