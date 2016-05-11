/**
 * It shows the output operation for the system.
 */
package Output;

/**
 * @author Chetan Goyal
 *
 */
public class OutputProcessor {

	private Balance balance;
    private BelowMinBalance belowMinBalance;
    private Deposit deposit;
    private EnterPin enterPin;
    private Menu menu;
    private IncorrectId incorrectId;
    private IncorrectPin incorrectPin;
    private Penalty penalty;
    private StoreData storeData;
    private TooManyAttempts tooManyAttempts;
    private Withdraw withdraw;

    public void displayBalance() {
        balance.displayBalance();
    }

    public void displayBelowMinBalance() {
        belowMinBalance.displayBelowMinBalance();
    }

    public void makeDeposit() {
        deposit.makeDeposit();
    }

    public void displayEnterPin() {
        enterPin.displayEnterPin();
    }

    public void displayMenu() {
        menu.displayMenu();
    }

    public void displayIncorrectId() {
        incorrectId.displayIncorrectId();
    }

    public void displayIncorrectPin() {
        incorrectPin.displayIncorrectPin();
    }

    public void chargePenalty() {
        penalty.chargePenalty();
    }

    public void storeData() {
        storeData.storeData();
    }

    public void displayTooManyAttempts() {
        tooManyAttempts.displayTooManyAttempts();
    }

    public void makeWithdraw() {
        withdraw.makeWithdraw();
    }


    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public void setBelowMinBalance(BelowMinBalance belowMinBalance) {
        this.belowMinBalance = belowMinBalance;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public void setEnterPin(EnterPin enterPin) {
        this.enterPin = enterPin;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setIncorrectId(IncorrectId incorrectId) {
        this.incorrectId = incorrectId;
    }

    public void setIncorrectPin(IncorrectPin incorrectPin) {
        this.incorrectPin = incorrectPin;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    public void setStoreData(StoreData storeData) {
        this.storeData = storeData;
    }

    public void setTooManyAttempts(TooManyAttempts tooManyAttempts) {
        this.tooManyAttempts = tooManyAttempts;
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }
}
