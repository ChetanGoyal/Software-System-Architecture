/**
 * This class has the input functions of the Account 1 class.
 */
package inputProc;

import java.util.Scanner;

import Constants.Operation;
import Data.Account1;
import MDA.MdaEfsm;

/**
 * @author Chetan Goyal
 *
 */
public class Account1_InputProcessor extends InputProcessor {

	 private Account1 acctData;
	 
	 private MdaEfsm model;
	 
	 public Account1_InputProcessor(Account1 acctData, MdaEfsm model) {
	        this.model = model;
	        this.acctData = acctData;
	    }
	 @Override
	 public void handleInput(){
		 process();
	 }
	 
	 public void open(String p, String y, float a) {
	        if (isNonEmpty(p) && isNonEmpty(y) && a >= 0) {
	            acctData.setPinInput(p);
	            acctData.setUidInput(y);
	            acctData.setBalInput(a);

	            model.open();
	        } else {
	            println("Invalid Input");
	        }
	    }
	 
	 public void pin(String x){
		 String pin= acctData.getPin();
		 int max= acctData.getMaxInvalidAttempts();
		 
		 if(x!=null && x.equals(pin)){
			 model.correctPin();
			 
			 int minBalance=acctData.getMinBalance();
			 float balance= acctData.getBal();
			 
			 if(balance>minBalance){
				 model.aboveMinBalance();
			 }else{
				 model.belowMinBalance();
			 }
		 }else {
			 model.incorrectPin(max);
		 }
	 }
	 
	 public void deposit(float d){
		 if(d > 0.0){
			 acctData.setDeposit(d);
			 model.deposit();
		 }else{
			 System.out.println("Deposit should be greater than 0.0");
		 }
	 }
	 
	 public void withdraw(float w){
		 if(w>0){
			 acctData.setWithdraw(w);
			 model.withdraw();
			 
			 float balance = acctData.getBal();
			 int minBalance = acctData.getMinBalance();
			 if(balance>minBalance){
				 model.aboveMinBalance();
			 }
			 else{
				 model.belowMinBalanceWithPenalty();
			 }
		 }else{
			 System.out.println("Withdraw Amount should be greater than 0.");
		 }
	 }
	 
	 public void balance(){
		 model.balance();
	 }

	 public void login(String y){
		 String userId= acctData.getUid();
		 if(y!=null && y.equals(userId)){
			 model.login();
		 }
		 else{
			 model.invalidLogin();
		 }
	 }
	 
	 public void logout(){
		 model.logout();
	 }
	 
	 public void lock(String x){
		 String pin = acctData.getPin();
		 
		 if(x!=null && x.equals(pin)){
			 model.lock();
		 }else{
			 model.incorrectLock();
		 }
	 }
	 
	 public void unlock(String x){
		 String pin = acctData.getPin();
		 
		 if(x != null && x.equals(pin)){
			 model.unlock();
	            checkMinBalance();
		 }else{
			 model.incorrectUnlock();
		 }
	 }
	 
	 private void checkMinBalance() {
	        
	        float balance = acctData.getBal();
	        int minBalance = acctData.getMinBalance();
	        if (balance > minBalance) {
	            model.aboveMinBalance();
	        } else {
	            model.belowMinBalance();
	        }
	    }
	 
	 public void process(){
		 
		 boolean flag = true;
		 Operation opCode = null;
		 
		 displayOperations();
		 
		 while(flag){
			 Scanner in = new Scanner(System.in);
			 System.out.println();
			 System.out.println("Account-1 Operations:");
			 System.out.println("0-Open, 1-Login, 2-Pin, 3-Deposit, 4-Withdraw, 5-Balance," +
					 			"6-Logout, 7-Lock, 8-Unlock, 9-Close");
			 
			 try{
				 int option = getIntInput(in, null);
				 opCode = Operation.value(option);
				 
				 switch(opCode){
				 
				 case OPEN:
					 String p = printOperationGetStringInput(in, "open(p,y,a)", "p(pin)):");
                     String y = getStringOperationInput(in, "y(userid):");
                     float a = getFloatOperationInput(in, "a(balance):");
                     
                     open(p, y, a);
                     break;
                     
				 case LOGIN:
                     String userId = printOperationGetStringInput(in, "login(int y)", "y(userid):");
                     login(userId);
                     break;
                     
				 case PIN:
                     String pin = printOperationGetStringInput(in, "pin(int x)", "x(pin):");

                     pin(pin);
                     break;
                     
				 case LOCK:
                     String pin1 = printOperationGetStringInput(in, "lock(int x)", "lock(pin):");

                     lock(pin1);
                     break;
                     
				 case UNLOCK:
                     String pin2 = printOperationGetStringInput(in, "unlock(int x)", "unlock(pin):");

                     unlock(pin2);
                     break;
                     
				 case BALANCE:
                     printOperation("balance()");
                     balance();
                     break;
                     
				 case DEPOSIT:
                     float d = printOperationGetFloatInput(in, "deposit(int d)", "d(Deposit amount):");

                     deposit(d);
                     break;
                     
				 case WITHDRAW:
                     float withdraw = printOperationGetFloatInput(in, "withdraw(int w)", "w(Withdraw amount):");

                     withdraw(withdraw);
                     break;
                     
				 case LOGOUT:
                     printOperation("Logged off");
                     logout();
                     break;
                     
				 case QUIT:
                     flag = false;
                     break;
                     
				 default:
                     println("Invalid option");
                     break;
				 }
				 System.out.println();
			 }catch(Exception e){
				 
			 }
		 }
		 System.out.println("Account 1 exiting.");
	 }
	 
	 public void displayOperations() {
	        println();
	        println(" ACCOUNT-1");
	        println(" Please make a note of operations");
	        println("0. Open(string,string,float)");
	        println("1. Login()");
	        println("2. Pin(string)");
	        println("3. Deposit(float)");
	        println("4. Withdraw(float)");
	        println("5. Balance()"); 
	        println("6. Logout()");
	        println("7. Lock(string)");
	        println("8. Unlock(string)");
	        println("9. Exit Account -1");
	    }
}
