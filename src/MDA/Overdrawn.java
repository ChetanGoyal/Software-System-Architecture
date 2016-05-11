/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Exception.AccountException;
import Output.OutputProcessor;
import static Constants.StateEnum.S1;
import static Constants.StateEnum.IDLE;
import static Constants.StateEnum.LOCKED;
/**
 * @author Chetan Goyal
 *
 */
public class Overdrawn extends State {
	public Overdrawn(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }
	
	@Override
	public void deposit(){
		outputProcessor.makeDeposit();
        model.changeState(S1);
	}
	
	public void withdraw(){
		outputProcessor.displayBelowMinBalance();
        throw new AccountException("displayBelowMinBalance");
	}
	
	@Override
    public void balance() {
        outputProcessor.displayBalance();
    }

    @Override
    public void incorrectLock() {
        outputProcessor.displayIncorrectPin();
    }

    @Override
    public void logout() {
        model.changeState(IDLE);

    }

    @Override
    public void lock() {
        model.changeState(LOCKED);
    }
	
	
}
