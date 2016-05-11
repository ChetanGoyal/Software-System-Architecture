/**
 * Represents the Below minimum balance message for account 1.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class BelowMinBalance1 extends BelowMinBalance {
	private Account1 data;

    public BelowMinBalance1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayBelowMinBalance() {
        System.out.println("Current Balance of $" + data.getBal() +
                " is below the Minimum balance amount of $" + data.getMinBalance());
    }
}
