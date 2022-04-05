package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;

public class CobolTest {

	@Test
	public void test() {
		Cobol c = new Cobol();
		
		String s = "NewDivision";
		c.setDivisionName(s);
		String s1 = "NewParagraph";
		c.setParagraphName(s1);
		String s2 = "NewComment";
		c.setCommentLine(s2);
		
		assertEquals(c.getDivisionName(), s);
		assertEquals(c.getParagraphName(), s1);
		assertEquals(c.getCommentLine(), s2);
	}

}
