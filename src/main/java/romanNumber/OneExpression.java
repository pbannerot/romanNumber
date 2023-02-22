/**
 *
 */
package romanNumber;

/**
 * @author pascal
 *
 */
public class OneExpression extends RomanExpression {
	/**
	 *
	 */
	private static final int ONE = 1;

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#one()
	 */
	public final String one() {
		return "I";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#four()
	 */
	public final String four() {
		return "IV";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#five()
	 */
	public final String five() {
		return "V";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#nine()
	 */
	public final String nine() {
		return "IX";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#multiplier()
	 */
	public final int multiplier() {
		return ONE;
	}
}
