package tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import lsystems.B_A;
import lsystems.LRule;

public class B_A_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new B_A();
		char actualMatch = 'B';
		char[] actualBody = {'A'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
