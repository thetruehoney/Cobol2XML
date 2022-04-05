package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class ParagraphAssembler extends Assembler {

	/**
	 * Pop a string, and set the target Paragraph Name to this
	 * string.
	 *
	 * @param   Assembly   the assembly to work on
	 */
	
	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setParagraphName(t.sval().trim() );
		a.setTarget(c);
	}
}
