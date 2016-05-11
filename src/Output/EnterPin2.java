/**
 * Represents the enter pin function of the output processor.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class EnterPin2 extends EnterPin {

	private Account2 data;

    public EnterPin2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayEnterPin() {
        System.out.println("ENTER PIN:");
    }
}
