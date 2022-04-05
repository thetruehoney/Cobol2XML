package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	LiteralTest.class, 
	NumTest.class, ParserTest.class, 
	SymbolTest.class, 
	TokenTest.class, 
	AssemblerTest.class, 
	AssemblyTest.class, 
	CobolParserTest.class, 
	CobolTest.class,
	ParserTest.class,
	XMLPayloadTest.class,
	TokenizerTest.class
	})
public class AllTests {

}
