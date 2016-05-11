/**
 * Represents the balance for account 2.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class Balance2 extends Balance {
	private Account2 data;

    public Balance2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayBalance() {
        int balance = data.getBalance();
        System.out.println("Balance amount = $ " + balance);
        System.out.println();
    }
}
