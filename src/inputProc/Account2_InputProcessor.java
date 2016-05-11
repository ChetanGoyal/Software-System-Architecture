/**
 * This class has the input functions of the Account 2 class.
 */
package inputProc;

import java.util.Scanner;

import Constants.Operation;
import Data.Account2;
import MDA.MdaEfsm;

/**
 * @author Chetan Goyal
 *
 */
public class Account2_InputProcessor extends InputProcessor {

	private Account2 acctData;
	
	private MdaEfsm model;
	
	public Account2_InputProcessor(Account2 acctData, MdaEfsm model) {
        this.model = model;
        this.acctData = acctData;
    }
	
	@Override
	public void handleInput() {
        process();
    }
	
	 public void OPEN(int p, int y, int a) {
	        if (p > 0 && y > 0 && a >= 0) {
	            acctData.setPinInput(p);
	            acctData.setUidInput(y);
	            acctData.setBalInput(a);

	            model.open();
	        } else {
	            System.out.println("Invalid Input");
	        }
	    }
	 
	 public void PIN(int x) {
	        int pin = acctData.getPin();
	        int max = acctData.getMaxInvalidAttempts();

	        if (x == pin) {
	            //correct pin
	            model.correctPin();

	            int minBalance = acctData.getMinBalance();
	            int balance = acctData.getBalance();

	            if (balance > minBalance) {
	                model.aboveMinBalance();
	            } else {
	                model.belowMinBalance();
	            }
	        } else {
	            model.incorrectPin(max);
	        }
	    }
	 
	 public void DEPOSIT(int d) {
	        if (d > 0) {
	            acctData.setDeposit(d);

	            //deposit the amount
	            model.deposit();

	            
	          //  checkMinBalance();
	        } else {
	            System.out.println("Deposit Amount should be greater than 0");
	        }
	    }
	 
	 public void WITHDRAW(int w) {
	        if (w > 0) {
	            acctData.setWithdraw(w);
	            model.withdraw();

	            //check for overdrawn condition
	            int balance = acctData.getBalance();
	            int minBalance = acctData.getMinBalance();
	            if (balance > minBalance) {
	                model.aboveMinBalance();
	            } else {
	                model.belowMinBalanceWithPenalty();
	            }
	        } else {
	            System.out.println("Withdraw Amount should be greater than 0");
	        }
	    }
	 
	 public void BALANCE() {
	        model.balance();
	    }
	 
	 public void LOGIN(int y) {
	        int userId = acctData.getUid();
	        if (y == userId) {
	            //correct login
	            model.login();
	        } else {
	            //incorrect login
	            model.invalidLogin();
	        }
	    }
	 
	 public void LOGOUT() {
	        model.logout();
	    }
	 
	 public void suspend(){
		 model.suspend();
	 }
	 
	 public void activate(){
		 
		 model.activate();
	 }
	 
	 private void checkMinBalance() {
	        
	        int balance = acctData.getBalance();
	        int minBalance = acctData.getMinBalance();
	        if (balance > minBalance) {
	            model.aboveMinBalance();
	        } else {
	            model.belowMinBalance();
	        }
	    }
	 
	 public void close(){
		 model.close();
	 }
	 
	 public void process(){
		 boolean flag = true;
	        Operation opcode = null;
	        
	        displayOperations();
	        
	        while(flag){
	        	Scanner in = new Scanner(System.in);
	        	System.out.println();
	        	System.out.println("Account 2 Operations:");
	        	System.out.println("0-OPEN, 1-LOGIN, 2-PIN, 3-DEPOSIT, 4-WITHDRAW,"+
	        	"5-BALANCE, 6-LOGOUT, 7-SUSPEND, 8-ACTIVATE, 9-CLOSE");
	        	
	        	try{
	        		int option = getIntInput(in, null);
	        		opcode=Operation.value(option);
	        		
	        		switch(opcode){
	        		case OPEN:
                        int p = printOperationGetIntInput(in, "open(p,y,a)", "p(pin)):");
                        int y = getIntOperationInput(in, "y(userid):");
                        int a = getIntOperationInput(in, "a(balance):");

                        OPEN(p, y, a);
                        break;

                    case LOGIN:
                        int userId = printOperationGetIntInput(in, "login(int y)", "y(userid):");
                        LOGIN(userId);
                        break;

                    case PIN:
                        int pin = printOperationGetIntInput(in, "pin(int x)", "x(pin):");

                        PIN(pin);
                        break;

                    case BALANCE:
                        printOperation("balance()");
                        BALANCE();
                        break;

                    case DEPOSIT:
                        int d = printOperationGetIntInput(in, "deposit(int d)", "d(Deposit amount):");

                        DEPOSIT(d);
                        break;

                    case WITHDRAW:
                        int withdraw = printOperationGetIntInput(in, "withdraw(int w)", "w(Withdraw amount):");

                        WITHDRAW(withdraw);
                        break;

                    case LOGOUT:
                        printOperation("Logged off");
                        LOGOUT();
                        break;
                        
                    case LOCK:
                    	printOperation("Account Suspended");
                    	suspend();
                    	break;
                    	
                    case UNLOCK:
                    	printOperation("In to Active state");
                    	activate();
                    	break;

                    case QUIT:
                    	close();
                        flag = false;
                        break;

                    default:
                        println("Invalid option");
                        break;
                }
                println();
            } catch (Exception e) {
                //ignore the exception.
            }
        }
        println("Account 2 exiting.");
	 }
	 
	 public void displayOperations() {
	        println();
	        println(" MENU");
	        println("0. OPEN(int,int,int)");
	        println("1. LOGIN(int)");
	        println("2. PIN(int)");
	        println("3. DEPOSIT(int)");
	        println("4. WITHDRAW(int)");
	        println("5. BALANCE(int)");
	        println("6. LOGOUT()");
	        println("7. SUSPEND(int)");
	        println("8. ACTIVATE(int)");
	        println("9. CLOSE");
	    }
}
