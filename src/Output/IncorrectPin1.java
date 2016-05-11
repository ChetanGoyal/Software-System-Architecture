/**
 * Represent the incorrect pin operation of the output processor class.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class IncorrectPin1 extends IncorrectPin {

	private Account1 data;

    public IncorrectPin1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayIncorrectPin() {
        System.out.println("Pin entered is not correct, please try again");
    }
}
