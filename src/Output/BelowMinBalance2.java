/**
 * Represents the below minimum balance message for account 2.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class BelowMinBalance2 extends BelowMinBalance {

	private Account2 data;

    public BelowMinBalance2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayBelowMinBalance() {
        System.out.println("Current Balance of $" + data.getBalance() +
                " is below Minimum balance amount of $" + data.getMinBalance());
    }
}
