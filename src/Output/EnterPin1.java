/**
 * Represents the enter pin operation of the output processor.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class EnterPin1 extends EnterPin {

	private Account1 data;

    public EnterPin1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayEnterPin() {
        System.out.println("ENTER PIN:");
    }
}
