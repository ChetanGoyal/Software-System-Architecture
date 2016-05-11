/**
 * This exception class handles all type of exception that might come while the system is running.
 */
package Exception;

/**
 * @author Chetan Goyal
 *
 */
public class AccountException extends RuntimeException {

	public AccountException(){
		
	}
	
	public AccountException(String message){
		super(message);
	}
	
	public AccountException(String message, Throwable cause){
		super(message,cause);
	}
	
	public AccountException(Throwable cause){
		super(cause);
	}
}
