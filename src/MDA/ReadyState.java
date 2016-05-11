/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.LOCKED;
import static Constants.StateEnum.S1;
import static Constants.StateEnum.IDLE;
import static Constants.StateEnum.SUSPEND;
/**
 * @author Chetan Goyal
 *
 */
public class ReadyState extends State {
	public ReadyState(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }

    @Override
    public void deposit() {
        outputProcessor.makeDeposit();
    }

    @Override
    public void withdraw() {
        outputProcessor.makeWithdraw();
        model.changeState(S1);
    }

    @Override
    public void balance() {
        outputProcessor.displayBalance();
    }

    @Override
    public void lock() {
        model.changeState(LOCKED);
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
   public void suspend(){
	   model.changeState(SUSPEND);
   }

}
