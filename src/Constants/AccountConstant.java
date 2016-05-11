/**
 * This is a constant class used to define the option menu that the user will get once 
 * system runs.
 */
package Constants;

/**
 * @author Chetan Goyal
 *
 */
public enum AccountConstant {
	Account_1(1),
	Account_2(2);
	
	private int id;
	
	private AccountConstant(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
}
