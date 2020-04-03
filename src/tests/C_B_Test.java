package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import lsystems.C_B;
import lsystems.LRule;

public class C_B_Test {
	@Test
	public void create() {
		LRule ruleMatcher = new C_B();
		char actualMatch = 'C';
		char[] actualBody = {'B'};
		assertEquals(actualMatch,ruleMatcher.getMatch());
		assertArrayEquals(actualBody,ruleMatcher.getBody()); 

	}
}
