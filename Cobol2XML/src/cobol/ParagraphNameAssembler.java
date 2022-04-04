package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class ParagraphNameAssembler extends Assembler {

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
		c.setParagraphName(t.sval() );
		a.setTarget(c);
	}
}
