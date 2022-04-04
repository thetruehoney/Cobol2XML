package junit;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import parse.tokens.Literal;

public class LiteralTest {

	@Test
	public void test() {
		String s = "comment";
		Literal literal = new Literal(s);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = literal.randomExpansion(7, 1);
		assertFalse(arrayList.isEmpty()); 
	}

}
