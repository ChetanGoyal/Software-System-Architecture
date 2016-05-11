/**
 * This classes manages the state transition after or before certain operation depending on the 
 * MDA-EFSM.
 */
package MDA;

import Output.OutputProcessor;
import static Constants.StateEnum.READY;
import static Constants.StateEnum.OVERDRAWN;
/**
 * @author Chetan Goyal
 *
 */
public class S1State extends State {

	public S1State(MdaEfsm model, OutputProcessor outputProcessor) {
        super(model, outputProcessor);
    }

    @Override
    public void aboveMinBalance() {
        model.changeState(READY);
    }

    @Override
    public void belowMinBalance() {
        model.changeState(OVERDRAWN);
    }

    @Override
    public void belowMinBalanceWithPenalty() {
        outputProcessor.chargePenalty();
        model.changeState(OVERDRAWN);
    }
}
