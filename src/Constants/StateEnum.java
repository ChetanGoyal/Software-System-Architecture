/**
 * This class has all the states and maintains those states as mentioned in the MDA-EFSM
 */
package Constants;

/**
 * @author Chetan Goyal
 *
 */
public enum StateEnum {
	IDLE(0),
	CHECK_PIN(1),
	READY(2),
	S1(3),
	OVERDRAWN(4),
	LOCKED(5),
	START(6),
	SUSPEND(7);
	
	private int id;
	private StateEnum(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public static int totalStates(){
		return StateEnum.class.getEnumConstants().length;
	}
}
