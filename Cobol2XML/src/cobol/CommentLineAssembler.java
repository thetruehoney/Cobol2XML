package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class CommentLineAssembler extends Assembler {

	/**
	 * Pop a string, and set the target C to this
	 * string.
	 *
	 * @param   Assembly   the assembly to work on
	 */
	
	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		String s = "";
		Token t = (Token) a.pop();
		if(t.sval() != null) {  
			s = s + t.sval().trim();
		}
		s = s + " " + a.remainder(" ");

		c.setCommentLine(s);
		a.setTarget(c);
	}
} 

