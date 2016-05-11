/**
 * It shows the penalty if applied and accordingly manages the balance.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class Penalty1 extends Penalty {

	private Account1 data;

    public Penalty1(Account1 data) {
        this.data = data;
    }

    @Override
    public void chargePenalty() {
        int penalty = data.getPenalty();
        if (penalty > 0) {
            float balance = data.getBal();
            balance =  balance - penalty;
            data.setBal(balance);
            System.out.println("Penalty of $ "+penalty + " is applied");
        }
    }
}
