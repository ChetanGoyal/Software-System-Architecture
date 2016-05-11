/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.CHECK_PIN;
/**
 * @author Chetan Goyal
 *
 */
public class IdleState extends State {

	public IdleState(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }

    @Override
    public void correctLogin() {
        model.resetNumOfAttempts();

        //Go to next step
        outputProcessor.displayEnterPin();

        //change state
        model.changeState(CHECK_PIN);
    }

    @Override
    public void invalidLogin() {
        outputProcessor.displayIncorrectId();
    }
}
