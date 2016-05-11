/**
 * It represents the withdrawal amount and accordingly manages the balance.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class Withdraw1 extends Withdraw {
	private Account1 data;

    public Withdraw1(Account1 data) {
        this.data = data;
    }

    @Override
    public void makeWithdraw() {
        float w = data.getWithdraw();
        if (w > 0) {
            float b = data.getBal();
            b = b - w;
            data.setBal(b);
        }
    }
}
