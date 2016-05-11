/**
 * This is the data class for the Account.
 */
package Data;

/**
 * @author Chetan Goyal
 *
 */
public class Account {
	protected int maxInvalidAttempts;
	protected int minBalance;
	protected int penalty;
	
	protected boolean locked;
	protected boolean suspended;
	
	public Account(){
	}

	public int getMaxInvalidAttempts() {
		return maxInvalidAttempts;
	}

	public void setMaxInvalidAttempts(int maxInvalidAttempts) {
		this.maxInvalidAttempts = maxInvalidAttempts;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}
	
	
}
