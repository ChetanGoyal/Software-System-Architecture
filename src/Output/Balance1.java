/**
 * Represents the balance for account 1.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class Balance1 extends Balance {
	private Account1 data;

    public Balance1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayBalance() {
        float balance = data.getBal();
        System.out.println("Balance amount = $ " + balance);
        System.out.println();
    }
}
