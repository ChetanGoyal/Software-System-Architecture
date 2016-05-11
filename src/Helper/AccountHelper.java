/**
 * This is the helper class used to initialize the processors once the account is selected.
 */
package Helper;

import AbsFactory.Account1Factory;
import AbsFactory.Account2Factory;
import AbsFactory.AccountAbstractFactory;
import Constants.AccountConstant;
import Data.Account;
import Exception.AccountException;
import MDA.MdaEfsm;
import Output.OutputProcessor;
import inputProc.InputProcessor;

/**
 * @author Chetan Goyal
 *
 */
public class AccountHelper {
	
	private static AccountHelper ourInstance = new AccountHelper();

    public static AccountHelper getInstance() {
        return ourInstance;
    }

    private AccountHelper() {
    }

    /**
     * This method is used for initializing the selected account service
     *
     * @param accountEnum
     */
    public void service(AccountConstant accountEnum) {

        
        final AccountAbstractFactory accountFactory = createAccountFactory(accountEnum);

       
        final Account accountData = accountFactory.createAccountData();

        
        OutputProcessor op = accountFactory.createOutputProcessor(accountData);

        
        MdaEfsm model = new MdaEfsm(op);

        
        InputProcessor inputProcessor = accountFactory.createInputProcessor(accountData, model);

        
        inputProcessor.handleInput();
    }

    /**
     * This method returns the factory implementation.
     *
     * @param accountEnum
     * @return account  factory implementation
     */
    public static AccountAbstractFactory createAccountFactory(AccountConstant accountEnum) {
        if (AccountConstant.Account_1.equals(accountEnum)) {
            return new Account1Factory();
        } else if (AccountConstant.Account_2.equals(accountEnum)) {
            return new Account2Factory();
        } else {
            throw new AccountException("Please select a Valid account type: either 1 or 2.");
        }
    }

}
