/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.S1;
import static Constants.StateEnum.IDLE;

/**
 * @author Chetan Goyal
 *
 */
public class CheckPinState extends State {

	public CheckPinState(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }

    @Override
    public void correctPin() {
        //Go to next step
        outputProcessor.displayMenu();

        //change state
        model.changeState(S1);
    }

    @Override
    public void incorrectPin(int max) {
        int attempts = model.getNumOfAttempts();
        if(attempts < max) {
            model.incrementNumOfAttempts();
            outputProcessor.displayIncorrectPin();
        } else if(attempts==max) {
            outputProcessor.displayTooManyAttempts();
            model.changeState(IDLE);
        }
    }

    @Override
    public void logout() {
        model.changeState(IDLE);
    }
}
