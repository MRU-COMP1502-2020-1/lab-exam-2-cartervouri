package tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import lsystems.A_BC;
import lsystems.LRule;

public class A_BC_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new A_BC();
		char actualMatch = 'A';
		char[] actualBody = {'B','C'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
