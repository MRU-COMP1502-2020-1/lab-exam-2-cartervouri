package tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import lsystems.A__X;
import lsystems.LRule;

public class A_X_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new A__X();
		char actualMatch = 'A';
		char[] actualBody = {};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
