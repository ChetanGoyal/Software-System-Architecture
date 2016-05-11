/**
 * Represents the incorrect id operation of the output processor class.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class IncorrectId2 extends IncorrectId {

	private Account2 data;

    public IncorrectId2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayIncorrectId() {
        System.out.println("User Id entered is not correct, please try again");
    }
}
