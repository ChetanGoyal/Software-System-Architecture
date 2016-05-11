/**
 * Represents the deposit amount and sets the combined balance accordingly.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class Deposit2 extends Deposit {
	private Account2 data;

    public Deposit2(Account2 data) {
        this.data = data;
    }

    @Override
    public void makeDeposit() {
        int d = data.getDeposit();
        if (d > 0) {
            int b = data.getBalance();
            b=b+d;
            data.setBalance(b);
        }
    }
}
