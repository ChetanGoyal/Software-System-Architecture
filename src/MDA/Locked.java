/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.S1;
/**
 * @author Chetan Goyal
 *
 */
public class Locked extends State {

	 public Locked(MdaEfsm model, OutputProcessor outputProcessor) {
	        super(model, outputProcessor);
	    }

	    @Override
	    public void unlock() {
	        model.changeState(S1);
	    }

	    @Override
	    public void incorrectUnlock() {
	        outputProcessor.displayIncorrectPin();
	    }
}
