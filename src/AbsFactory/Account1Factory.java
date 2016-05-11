/**
 * This class implements the Abstract Factory Pattern.
 */
package AbsFactory;

import Data.Account;
import Data.Account1;
import MDA.MdaEfsm;
import Output.Balance;
import Output.Balance1;
import Output.BelowMinBalance;
import Output.BelowMinBalance1;
import Output.Deposit;
import Output.Deposit1;
import Output.EnterPin;
import Output.EnterPin1;
import Output.IncorrectId;
import Output.IncorrectId1;
import Output.IncorrectPin;
import Output.IncorrectPin1;
import Output.Menu;
import Output.Menu1;
import Output.Penalty;
import Output.Penalty1;
import Output.StoreData;
import Output.StoreData1;
import Output.TooManyAttempts;
import Output.TooManyAttempts1;
import Output.Withdraw;
import Output.Withdraw1;
import inputProc.Account1_InputProcessor;
import inputProc.InputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public class Account1Factory extends AccountAbstractFactory {

    public Account createAccountData() {
        return new Account1();
    }

    public InputProcessor createInputProcessor(Account data, MdaEfsm mdaefsm) {
        return new Account1_InputProcessor((Account1)data, mdaefsm);
    }

    public Balance createBalance(Account data) {
        return new Balance1((Account1) data);
    }

    public BelowMinBalance createBelowMinBalance(Account data) {
        return new BelowMinBalance1((Account1) data);
    }

    public Deposit createDeposit (Account data) {
        return new Deposit1((Account1) data);
    }

    public EnterPin createDisplayEnterPin(Account data) {
        return new EnterPin1((Account1) data);
    }

    public IncorrectId createIncorrectId(Account data) {
        return new IncorrectId1((Account1) data);
    }

    public IncorrectPin createIncorrectPin(Account data) {
        return new IncorrectPin1((Account1) data);
    }

    public Menu createMenu(Account data) {
        return new Menu1((Account1) data);
    }

    public Penalty createPenalty(Account data) {
        return new Penalty1((Account1) data);
    }

    public StoreData createStoreData(Account data) {
        return new StoreData1((Account1) data);
    }

    public TooManyAttempts createTooManyAttempts(Account data) {
        return new TooManyAttempts1((Account1) data);
    }

    public Withdraw createWithdraw(Account data) {
        return new Withdraw1((Account1) data);
    }
}
