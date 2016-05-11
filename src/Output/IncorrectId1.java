/**
 * Represents the incorrect id operation of the output processor.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class IncorrectId1 extends IncorrectId {

	private Account1 data;

    public IncorrectId1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayIncorrectId() {
        System.out.println("User Id entered is not correct, please try again");
    }
}
