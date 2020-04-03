package tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import lsystems.A_AA;
import lsystems.LRule;

public class A_AA_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new A_AA();
		char actualMatch = 'A';
		char[] actualBody = {'A','A'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
