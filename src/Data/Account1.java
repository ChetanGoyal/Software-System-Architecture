/**
 * This is the temporary data store for account 1.
 */
package Data;

/**
 * @author Chetan Goyal
 *
 */
public class Account1 extends Account {
	private String pin;
	private String uid;
	private float bal;
	private float deposit;
	private float withdraw;
	private String uidInput;
	private String pinInput;
	private float balInput;
	
	/**
	 * This funtion sets the parameter of the base Account data store.
	 */
	public Account1(){
		super();
		maxInvalidAttempts=3;
		minBalance=500;
		penalty=20;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	public String getUidInput() {
		return uidInput;
	}

	public void setUidInput(String uidInput) {
		this.uidInput = uidInput;
	}

	public String getPinInput() {
		return pinInput;
	}

	public void setPinInput(String pinInput) {
		this.pinInput = pinInput;
	}

	public float getBalInput() {
		return balInput;
	}

	public void setBalInput(float balInput) {
		this.balInput = balInput;
	}
	
	
}
