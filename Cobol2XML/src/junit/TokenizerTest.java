package junit;

import static org.junit.Assert.*;
import org.junit.Test;
import parse.tokens.TokenAssembly;


public class TokenizerTest {

	@Test
	public void test() {
		String s = "NewLine"; 
		String s1 = "";
		TokenAssembly ta = new TokenAssembly(s);
		while (ta.hasMoreElements()) {
			s1 = s1 + ta.nextElement();
		}
				
		assertEquals(s, s1);
	}

}
