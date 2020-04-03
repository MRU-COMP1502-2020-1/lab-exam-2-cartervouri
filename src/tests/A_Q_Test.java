package tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import lsystems.A_Q;
import lsystems.LRule;

public class A_Q_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new A_Q();
		char actualMatch = 'A';
		char[] actualBody = {'Q'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
