/**
 * This classes manages all the states along with the list of events as defined.
 */
package MDA;

import Constants.StateEnum;

import static Constants.StateEnum.*;
import Output.OutputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public class MdaEfsm {

	private State states[];
	private State currentState;
	
	private OutputProcessor outputProcessor;
	private int numOfAttempts;
	
	public MdaEfsm(OutputProcessor op){
		outputProcessor =  op;
		initializeStates();
	}
	
	public void initializeStates() {
        states = new State[StateEnum.totalStates()];
        states[START.getId()]=new StartState(this, outputProcessor);
        states[START.getId()] = new StartState(this, outputProcessor);
        states[IDLE.getId()] = new IdleState(this, outputProcessor);
        states[CHECK_PIN.getId()] = new CheckPinState(this, outputProcessor);
        states[READY.getId()] = new ReadyState(this, outputProcessor);
        states[S1.getId()] = new S1State(this, outputProcessor);
        states[LOCKED.getId()] = new Locked(this, outputProcessor);
        states[OVERDRAWN.getId()] = new Overdrawn(this, outputProcessor);
        states[SUSPEND.getId()] = new Suspended(this, outputProcessor);
        changeState(START);
    }

    public void changeState(StateEnum stateEnum) {
        if (stateEnum != null) {
            currentState = states[stateEnum.getId()];
        }
    }

    public int getNumOfAttempts() {
        return numOfAttempts;
    }

    public void resetNumOfAttempts() {
        this.numOfAttempts = 0;
    }

    public void incrementNumOfAttempts() {
        this.numOfAttempts++;
    }

    public void open() {
        currentState.open();
    }

    public void login() {
        currentState.correctLogin();
    }

    public void invalidLogin() {
        currentState.invalidLogin();
    }

    public void correctPin() {
        currentState.correctPin();
    }

    public void incorrectPin(int max) {
        currentState.incorrectPin(max);
    }

    public void aboveMinBalance() {
        currentState.aboveMinBalance();
    }

    public void belowMinBalance() {
        currentState.belowMinBalance();
    }

    public void belowMinBalanceWithPenalty() {
        currentState.belowMinBalanceWithPenalty();
    }

    public void deposit() {
        currentState.deposit();
    }

    public void withdraw() {
        currentState.withdraw();
    }

    public void balance() {
        currentState.balance();
    }

    public void lock() {
        currentState.lock();
    }

    public void incorrectLock() {
        currentState.incorrectLock();
    }

    public void unlock() {
        currentState.unlock();
    }

    public void incorrectUnlock() {
        currentState.incorrectUnlock();
    }

    public void logout() {
        currentState.logout();
    }
    
    public void suspend() {
        currentState.suspend();
    }
    
    public void activate() {
        currentState.activate();
    }
    
    public void close() {
        currentState.close();
    }
}

