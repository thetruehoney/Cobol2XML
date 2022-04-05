package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class CustomAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setCustomName(t.sval().trim());
		t = (Token) a.pop();
		c.setCustomContent(t.sval().trim());
		a.setTarget(c);
	}

}
