package demo.java7;

import org.apache.log4j.Logger;

/**
 * Shows checked/unchecked exceptions + Java 7 multi catch exceptions.
 * 
 * @author bbaraski
 *
 */
public class Java7ExceptionHandling {

	final static Logger logger = Logger.getLogger(Java7ExceptionHandling.class);

	public static void main(String[] args) {

		// Before JAVA 7
		try {
			new Java7ExceptionHandling().check();
		} catch (CheckedException e) {
			logger.error("Error here", e);
		} catch (UncheckedException e) {
			logger.error("Error here", e);
		}

		// From Java 7
		try {
			new Java7ExceptionHandling().check();
		} catch (CheckedException | UncheckedException e) {
			logger.error("Error here", e);
		}

	}

	public void check() throws CheckedException {
		throw new UncheckedException();
	}
}
