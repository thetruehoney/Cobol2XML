package cobol;

import java.util.ArrayList;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class ListAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		ArrayList<Object> list = new ArrayList<Object>();
		
		Token t = (Token) a.pop();
		list.add(t.toString());
		
		String s = a.remainder(" ");
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    list.add(words[i]);
		}
		c.setListElement(list);
		a.setTarget(c);
	}
}
