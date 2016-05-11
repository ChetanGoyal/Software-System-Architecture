/**
 * It shows the maximum number of attempts user can have while entering the pin.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class TooManyAttempts1 extends TooManyAttempts {
	private Account1 data;

    public TooManyAttempts1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayTooManyAttempts() {
        System.out.println("Exceeded maximum number of incorrect attempts " +
                "(" + data.getMaxInvalidAttempts()+ ")");
    }
}
