package puzzles;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import puzzles.*;

public class ReverseStringTest {
	
	ReverseString rs;
	
	@Before
	public void init(){
		this.rs = new ReverseString();
		
	}
	
	@Test
	public void testReverseStringWithJavaApi() {
	
		assertEquals("CBA",rs.reverseJava("ABC"));
		assertEquals("21ba",rs.reverseJava("ab12"));
		assertEquals("",rs.reverseJava(""));
		assertEquals("a",rs.reverseJava("a"));
		assertEquals("aaa",rs.reverseJava("aaa"));
		assertEquals("aba",rs.reverseJava("aba"));
		assertEquals("Bbbaa",rs.reverseJava("aabbB"));
	
	}
	
	
	@Test
	public void testReverseStringWithStringBuilder() {

	
		assertEquals("EDCBA",rs.reverseStringBuilder("ABCDE"));
		assertEquals("21ba",rs.reverseStringBuilder("ab12"));
		assertEquals("",rs.reverseStringBuilder(""));
		assertEquals("a",rs.reverseStringBuilder("a"));
		assertEquals("aaa",rs.reverseStringBuilder("aaa"));
		assertEquals("aba",rs.reverseStringBuilder("aba"));
		assertEquals("Bbbaa",rs.reverseStringBuilder("aabbB"));
	
	}
	
	@Test
	public void testReverseStringWithChar() {

		assertEquals("EDCBA",rs.reverseChar("ABCDE"));
		assertEquals("21ba",rs.reverseChar("ab12"));
		assertEquals("",rs.reverseChar(""));
		assertEquals("a",rs.reverseChar("a"));
		assertEquals("aaa",rs.reverseChar("aaa"));
		assertEquals("aba",rs.reverseChar("aba"));
		assertEquals("Bbbaa",rs.reverseChar("aabbB"));
	
	}
	
	@Test
	public void testReverseStringWithCharEffectivly() {

		assertEquals("EDCBA",rs.reverseCharEffective("ABCDE"));
		assertEquals("21ba",rs.reverseCharEffective("ab12"));
		assertEquals("",rs.reverseCharEffective(""));
		assertEquals("a",rs.reverseCharEffective("a"));
		assertEquals("aaa",rs.reverseCharEffective("aaa"));
		assertEquals("aba",rs.reverseCharEffective("aba"));
		assertEquals("Bbbaa",rs.reverseCharEffective("aabbB"));
	
	}
	
		
}
