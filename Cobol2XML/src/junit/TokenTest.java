package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
		char c = 'a';
		char c1 = 'b';

		Token t = new Token(c);
		Token t1 = new Token(c1);
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertTrue(t.isSymbol()); 
		assertFalse(t.equalsIgnoreCase(t1));
	}

}
