/**
 *
 */
package romanNumber;

/**
 * @author pascal
 *
 */
public class ThousandExpression extends RomanExpression {
	/**
	 *
	 */
	private static final int THOUSAND = 1000;

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#one()
	 */
	public final String one() {
		return "M";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#four()
	 */
	public final String four() {
		return " ";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#five()
	 */
	public final String five() {
		return " ";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#nine()
	 */
	public final String nine() {
		return " ";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#multiplier()
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see romanNumber.RomanExpression#multiplier()
	 */
	public final int multiplier() {
		return THOUSAND;
	}
}
