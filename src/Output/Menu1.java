/**
 * It shows the menu of the operations once pin is entered.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class Menu1 extends Menu {

	private Account1 data;

    public Menu1(Account1 data) {
        this.data = data;
    }

    @Override
    public void displayMenu() {
        System.out.println("TRANSACTION MENU:");
        System.out.println("DEPOSIT");
        System.out.println("WITHDRAW");
        System.out.println("BALANCE");
        System.out.println("LOCK");
        System.out.println("UNLOCK");
        System.out.println();
    }
}
