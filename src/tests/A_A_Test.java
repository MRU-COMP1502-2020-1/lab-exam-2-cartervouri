package tests;
import lsystems.LRule;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import  lsystems.A_A;

public class A_A_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new A_A();
		char actualMatch = 'A';
		char[] actualBody = {'A'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 	
	}
}

