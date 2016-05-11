/**
 * It shows the menu once pin is entered.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class Menu2 extends Menu {
	private Account2 data;

    public Menu2(Account2 data) {
        this.data = data;
    }

    @Override
    public void displayMenu() {
        System.out.println("~~~TRANSACTION MENU~~~");
        System.out.println("DEPOSIT");
        System.out.println("WITHDRAW");
        System.out.println("BALANCE");
        System.out.println("SUSPEND");
        System.out.println();
    }
}
