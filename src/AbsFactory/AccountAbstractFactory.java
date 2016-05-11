/**
 * This class is the super class of the abstract factory pattern where in the input processes are defined.
 */
package AbsFactory;

import Data.Account;
import MDA.MdaEfsm;
import Output.Balance;
import Output.BelowMinBalance;
import Output.Deposit;
import Output.EnterPin;
import Output.IncorrectId;
import Output.IncorrectPin;
import Output.Menu;
import Output.OutputProcessor;
import Output.Penalty;
import Output.StoreData;
import Output.TooManyAttempts;
import Output.Withdraw;
import inputProc.InputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public abstract class AccountAbstractFactory {
	
	public abstract Account createAccountData();
	public abstract InputProcessor createInputProcessor(Account data,MdaEfsm mdaefsm);
	
	public OutputProcessor createOutputProcessor(Account data){
		final OutputProcessor op = new OutputProcessor();
	      	op.setBalance(createBalance(data));
	        op.setBelowMinBalance(createBelowMinBalance(data));
	        op.setDeposit(createDeposit(data));
	        op.setEnterPin(createDisplayEnterPin(data));
	        op.setIncorrectId(createIncorrectId(data));
	        op.setIncorrectPin(createIncorrectPin(data));
	        op.setMenu(createMenu(data));
	        op.setPenalty(createPenalty(data));
	        op.setStoreData(createStoreData(data));
	        op.setTooManyAttempts(createTooManyAttempts(data));
	        op.setWithdraw(createWithdraw(data));
	        return op;
	    }
	
	public abstract Balance createBalance(Account data);

    public abstract BelowMinBalance createBelowMinBalance(Account data);

    public abstract Deposit createDeposit(Account data);

    public abstract EnterPin createDisplayEnterPin(Account data);

    public abstract IncorrectId createIncorrectId(Account data);

    public abstract IncorrectPin createIncorrectPin(Account data);

    public abstract Menu createMenu(Account data);

    public abstract Penalty createPenalty(Account data);

    public abstract StoreData createStoreData(Account data);

    public abstract TooManyAttempts createTooManyAttempts(Account data);

    public abstract Withdraw createWithdraw(Account data);
	}

