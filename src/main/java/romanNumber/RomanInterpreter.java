/**
 *
 */
package romanNumber;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pascal
 *
 */
public class RomanInterpreter {
	private static final Logger LOGGER = LoggerFactory.getLogger(RomanInterpreter.class);
	private int result = 0;

	/**
	 *
	 */
	public RomanInterpreter() {
	}

	public void compute(String romanNumber) {
		RomanContext context = new RomanContext(romanNumber);

		ArrayList<RomanExpression> romanTree = new ArrayList<RomanExpression>();

		romanTree.add(new ThousandExpression());
		romanTree.add(new HundredExpression());
		romanTree.add(new TenExpression());
		romanTree.add(new OneExpression());

		// Interpret
		for (RomanExpression expression : romanTree) {
			expression.interpret(context);
		}

		LOGGER.info(romanNumber + " = " + Integer.toString(context.getOutput()));
		setResult(context.getOutput());
	}

	/**
	 * @return the result
	 */
	public final int getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	protected final void setResult(int result) {
		this.result = result;
	}
}
