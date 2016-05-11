/**
 * It shows the penalty applied and accordingly manages the balance.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class Penalty2 extends Penalty {

	private Account2 data;

    public Penalty2(Account2 data) {
        this.data = data;
    }

    @Override
    public void chargePenalty() {
        int penalty = data.getPenalty();
        int balance = data.getBalance();
        balance =  balance - penalty;
        data.setBalance(balance);
        System.out.println("Penalty of $ "+penalty + " is applied");
    }
}
