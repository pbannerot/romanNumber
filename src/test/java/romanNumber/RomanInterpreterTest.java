/**
 *
 */
package romanNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author pascal
 *
 */
public class RomanInterpreterTest {

	/**
	 * Test method for
	 * {@link romanNumber.RomanInterpreter#RomanInterpreter()}.
	 */
	@Test
	public final void testRomanInterpreter() {
		RomanInterpreter romanInterpreter = new RomanInterpreter();

		romanInterpreter.compute("MCMXXVIII");
		assertEquals(1928, romanInterpreter.getResult());

		romanInterpreter.compute("M");
		assertEquals(1000, romanInterpreter.getResult());

		romanInterpreter.compute("C");
		assertEquals(100, romanInterpreter.getResult());

		romanInterpreter.compute("CD");
		assertEquals(400, romanInterpreter.getResult());

		romanInterpreter.compute("D");
		assertEquals(500, romanInterpreter.getResult());

		romanInterpreter.compute("CM");
		assertEquals(900, romanInterpreter.getResult());

		romanInterpreter.compute("X");
		assertEquals(10, romanInterpreter.getResult());

		romanInterpreter.compute("XL");
		assertEquals(40, romanInterpreter.getResult());

		romanInterpreter.compute("L");
		assertEquals(50, romanInterpreter.getResult());

		romanInterpreter.compute("XC");
		assertEquals(90, romanInterpreter.getResult());

		romanInterpreter.compute("I");
		assertEquals(1, romanInterpreter.getResult());

		romanInterpreter.compute("IV");
		assertEquals(4, romanInterpreter.getResult());

		romanInterpreter.compute("V");
		assertEquals(5, romanInterpreter.getResult());

		romanInterpreter.compute("IX");
		assertEquals(9, romanInterpreter.getResult());
	}

}
