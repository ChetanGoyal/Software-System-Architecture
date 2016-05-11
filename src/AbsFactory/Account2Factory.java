/**
 * This class implements the Abstract factory pattern.
 */
package AbsFactory;

import Data.Account;
import Data.Account2;
import MDA.MdaEfsm;
import Output.Balance;
import Output.Balance2;
import Output.BelowMinBalance;
import Output.BelowMinBalance2;
import Output.Deposit;
import Output.Deposit2;
import Output.EnterPin;
import Output.EnterPin2;
import Output.IncorrectId;
import Output.IncorrectId2;
import Output.IncorrectPin;
import Output.IncorrectPin2;
import Output.Menu;
import Output.Menu2;
import Output.Penalty;
import Output.Penalty2;
import Output.StoreData;
import Output.StoreData2;
import Output.TooManyAttempts;
import Output.TooManyAttempts2;
import Output.Withdraw;
import Output.Withdraw2;
import inputProc.Account2_InputProcessor;
import inputProc.InputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public class Account2Factory extends AccountAbstractFactory {

    public Account createAccountData() {
        return new Account2();
    }

    public InputProcessor createInputProcessor(Account data, MdaEfsm mdaefsm) {
        return new Account2_InputProcessor((Account2) data, mdaefsm);
    }

    public Balance createBalance(Account data) {
        return new Balance2((Account2) data);
    }

    public BelowMinBalance createBelowMinBalance(Account data) {
        return new BelowMinBalance2((Account2) data);
    }

    public Deposit createDeposit (Account data) {
        return new Deposit2((Account2) data);
    }

    public EnterPin createDisplayEnterPin(Account data) {
        return new EnterPin2((Account2) data);
    }

    public IncorrectId createIncorrectId(Account data) {
        return new IncorrectId2((Account2) data);
    }

    public IncorrectPin createIncorrectPin(Account data) {
        return new IncorrectPin2((Account2) data);
    }

    public Menu createMenu(Account data) {
        return new Menu2((Account2) data);
    }

    public Penalty createPenalty(Account data) {
        return new Penalty2((Account2) data);
    }

    public StoreData createStoreData(Account data) {
        return new StoreData2((Account2) data);
    }

    public TooManyAttempts createTooManyAttempts(Account data) {
        return new TooManyAttempts2((Account2) data);
    }

    public Withdraw createWithdraw(Account data) {
        return new Withdraw2((Account2) data);
    }
}
