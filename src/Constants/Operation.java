/**
 * This class contains all the operations managed by the accounts.
 */
package Constants;

/**
 * @author Chetan Goyal
 *
 */
public enum Operation {
	OPEN(0),
	LOGIN(1),
	PIN(2),
	DEPOSIT(3),
	WITHDRAW(4),
	BALANCE(5),
	LOGOUT(6),
	LOCK(7),
	UNLOCK(8),
	QUIT(9);
	
	private int id;
	
	private Operation(int id){
		this.id=id;
	}
	
	public static Operation value(int code){
		final Operation[] opr = Operation.class.getEnumConstants();
		for(Operation op:opr){
			if(op.id==code){
				return op;
			}
		}
		return null;
	}
	
}
