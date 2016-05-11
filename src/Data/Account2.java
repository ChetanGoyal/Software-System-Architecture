/**
 * This is the temporary data store for account 2
 */
package Data;

/**
 * @author Chetan Goyal
 *
 */
public class Account2 extends Account {
	private int pin;
	private int uid;
	private int balance;
	private int deposit;
	private int withdraw;
	private int pinInput;
	private int uidInput;
	private int balInput;
	
	/**
	 * This funtion sets the parameter of the base Account data store.
	 */
	public Account2(){
		super();
		maxInvalidAttempts=2;
		minBalance=0;
		penalty=0;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getPinInput() {
		return pinInput;
	}

	public void setPinInput(int pinInput) {
		this.pinInput = pinInput;
	}

	public int getUidInput() {
		return uidInput;
	}

	public void setUidInput(int uidInput) {
		this.uidInput = uidInput;
	}

	public int getBalInput() {
		return balInput;
	}

	public void setBalInput(int balInput) {
		this.balInput = balInput;
	}
	
}
