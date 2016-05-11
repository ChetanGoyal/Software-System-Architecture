/**
 * It shows the maximum number of attempts user can have while entering the pin.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class TooManyAttempts2 extends TooManyAttempts {
	private Account2 data;

    public TooManyAttempts2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayTooManyAttempts() {
        System.out.println("Exceeded maximum number of incorrect attempts " +
                "(" + data.getMaxInvalidAttempts()+ ")");
    }
}
