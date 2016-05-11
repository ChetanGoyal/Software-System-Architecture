/**
 * It represents the withdrawal amount and accordingly manages the balance.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class Withdraw2  extends Withdraw {
	private Account2 data;

    public Withdraw2(Account2 data) {
        this.data = data;
    }

    @Override
    public void makeWithdraw() {
        int w = data.getWithdraw();
        if (w > 0) {
            int b = data.getBalance();
            b = b - w;
            data.setBalance(b);
        }
    }
}
