package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.Assembly;
import parse.tokens.TokenAssembly;

public class AssemblyTest {

	@Test
	public void test() {
		String s = "NewLine";
		Assembly a = new TokenAssembly(s);
		assertTrue(a.stackIsEmpty());
	}

}
