package junit;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.Test;
import cobol.Cobol;
import xmlwriter.XMLPayload;

public class XMLPayloadTest {

	@Test
	public void test() throws IOException {
		String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><cobol><division>test</division><paragraph>test</paragraph></cobol>";
		String s1 = "";
		Cobol c = new Cobol();
		c.setDivisionName("test");
		c.setParagraphName("test");

		XMLPayload xml = new XMLPayload();
		xml.addElements(c);
		xml.writeFile("test.cbl");

		InputStream is = new FileInputStream("././test.cbl");
		BufferedReader r = new BufferedReader(new InputStreamReader(is));

		for (String line = r.readLine(); line != null; line = r.readLine()) {
			s1 = s1 + line.trim();
		}
		System.out.print(s1);
		r.close();

		assertEquals(s,s1);
	}

}

