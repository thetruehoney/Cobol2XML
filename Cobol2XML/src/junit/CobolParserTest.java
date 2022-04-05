package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class CobolParserTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		String s = "newLine division.";
		t.setString(s);
		
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		assertEquals(c.getDivisionName(), "newLine");
	}

}
