/**
 * This is  the main class responsible for running the application.
 */
package mainClass;

import java.util.InputMismatchException;
import java.util.Scanner;

import Constants.AccountConstant;
import Helper.AccountHelper;

/**
 * @author Chetan Goyal
 *
 */
public class AccountMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AccountMain account = new AccountMain();
		account.displayFirstMenu();
		}
	
	public void displayFirstMenu(){
		AccountHelper helper = AccountHelper.getInstance();
		
		boolean flag = true;
		while(flag){
			Scanner input = new Scanner(System.in);
			int option= 0;
			
			System.out.println("Welcome:");
			System.out.println("1: Account-1");
			System.out.println("2: Account-2");
			
			try{
				option=input.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Invalid");
				continue;
			}
			switch(option){
			case 1: 
				helper.service(AccountConstant.Account_1);
				break;
				
			case 2:
				helper.service(AccountConstant.Account_2);
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
			}
			//input.close();     //Preventing the resource leak.
		}
	}

}
