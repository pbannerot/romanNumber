/**
 *
 */
package romanNumber;

/**
 * @author pascal
 *
 */
public class HundredExpression extends RomanExpression {
	/**
	 *
	 */
	private static final int HUNDRED = 100;

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#one()
	 */
	public final String one() {
		return "C";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#four()
	 */
	public final String four() {
		return "CD";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#five()
	 */
	public final String five() {
		return "D";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#nine()
	 */
	public final String nine() {
		return "CM";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#multiplier()
	 */
	public final int multiplier() {
		return HUNDRED;
	}
}
