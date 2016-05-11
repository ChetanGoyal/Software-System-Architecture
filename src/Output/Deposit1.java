/**
 * Represents the deposit amount and sets the combined balance accordingly.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class Deposit1 extends Deposit {
	private Account1 data;

    public Deposit1(Account1 data) {
        this.data = data;
    }

    @Override
    public void makeDeposit() {
        float d = data.getDeposit();
        if (d > 0) {
            float b = data.getBal();
            b=b+d;
            data.setBal(b);
        }
    }
}
