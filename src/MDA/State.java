/**
 * This is a super class extended by all the  States by which respective error is thrown in case 
 * state transition is not allowed to occur.
 */
package MDA;

import Exception.AccountException;
import Output.OutputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public abstract class State {

	protected MdaEfsm model;

    protected OutputProcessor outputProcessor;

    public State(MdaEfsm model, OutputProcessor outputProcessor) {
        this.model = model;
        this.outputProcessor = outputProcessor;
    }

    private void invalidOperation() {
        System.out.println("Not a valid operation");
        throw new AccountException("Invalid Operation");
    }

    public void open() {
        System.out.println("Account Open.");
    	//invalidOperation();
    }

    public void correctLogin() {
        invalidOperation();
    }

    public void invalidLogin() {
        invalidOperation();
    }

    public void correctPin() {
        invalidOperation();
    }

    public void incorrectPin(int max) {
        invalidOperation();
    }

    public void aboveMinBalance() {
        invalidOperation();
    }

    public void belowMinBalance() {
        invalidOperation();
    }

    public void belowMinBalanceWithPenalty() {
        invalidOperation();
    }

    public void deposit() {
        invalidOperation();
    }

    public void withdraw() {
        invalidOperation();
    }

    public void balance() {
        invalidOperation();
    }

    public void lock() {
        invalidOperation();
    }

    public void incorrectLock() {
        invalidOperation();
    }

    public void unlock() {
        invalidOperation();
    }

    public void incorrectUnlock() {
        invalidOperation();
    }

    public void logout() {
        invalidOperation();
    }
    
    public void suspend(){
    	invalidOperation();
    }
    
    public void activate(){
    	invalidOperation();
    }
    
    public void close(){
    	invalidOperation();
    }
}
