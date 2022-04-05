package junit;

import static org.junit.Assert.*;
import org.junit.Test;
import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class AssemblerTest {

	@Test
	public void test() {
		String s = "NewLine";
		String s1 = "NewLine division.";
		
		Cobol c = new Cobol();
		c.setDivisionName(s);
						
		Parser p = CobolParser.start();
		Tokenizer t = CobolParser.tokenizer();
		t.setString(s1);
		
		Assembly in = new TokenAssembly(t);
		
		Assembly out = p.bestMatch(in);
		Cobol c1 = new Cobol();
		c1 = (Cobol) out.getTarget();
		
		
		assertTrue(c.getDivisionName().equals(c1.getDivisionName()));
	}

}
