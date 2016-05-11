/**
 * Represents the incorrect pin of the output processor class.
 *
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class IncorrectPin2 extends IncorrectPin {

	private Account2 data;

    public IncorrectPin2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayIncorrectPin() {
        System.out.println("Pin entered is not correct, please try again");
    }
}
