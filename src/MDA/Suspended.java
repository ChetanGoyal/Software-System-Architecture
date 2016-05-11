/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import static Constants.StateEnum.READY;
import Output.OutputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public class Suspended extends State {
	public Suspended(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }
	@Override
	public void activate(){
		 model.changeState(READY);
	}
	
	@Override
	public void balance(){
		outputProcessor.displayBalance();
	}
	
	@Override
	public void close(){
		System.exit(0);
	}
}
