/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.IDLE;
/**
 * @author Chetan Goyal
 *
 */
public class StartState extends State {
	public StartState(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }

    public void open() {
        outputProcessor.storeData();
        model.changeState(IDLE);
    }
}
