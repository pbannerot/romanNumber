/**
 *
 */
package romanNumber;

/**
 * @author pascal
 *
 */
public class TenExpression extends RomanExpression {
	/**
	 *
	 */
	private static final int TEN = 10;

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#one()
	 */
	public final String one() {
		return "X";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#four()
	 */
	public final String four() {
		return "XL";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#five()
	 */
	public final String five() {
		return "L";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#nine()
	 */
	public final String nine() {
		return "XC";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#multiplier()
	 */
	public final int multiplier() {
		return TEN;
	}
}
