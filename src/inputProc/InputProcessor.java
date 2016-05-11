/**
 * This is the input processor handling all types of inputs
 */
package inputProc;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.AccountException;

/**
 * @author Chetan Goyal
 *
 */
public abstract class InputProcessor {
	public abstract void handleInput();

    protected int getIntOperationInput(Scanner in, String msg) {
        return getIntInput(in, "Enter value of the parameter " + msg);
    }

    protected int getIntInput(Scanner in, String msg) {
        int p = -1;
        if (msg != null) {
            println(msg);
        }
        try {
            p = in.nextInt();
        } catch (InputMismatchException e) {
            final String err = "Invalid data entered, Please re-enter";
            println(err);
            throw new AccountException(err);
        }
        return p;
    }

    protected String getStringOperationInput(Scanner in, String msg) {
        return getStringInput(in, "Enter value of the parameter " + msg);
    }

    protected String getStringInput(Scanner in, String msg) {
        String p = null;
        println(msg);
        try {
            p = in.next();
        } catch (InputMismatchException e) {
            final String err = "Invalid data entered, Please re-enter";
            println(err);
            throw new AccountException(err);
        }
        return p;
    }

    protected Float getFloatOperationInput(Scanner in, String msg) {
        return getFloatInput(in, "Enter value of the parameter " + msg);
    }

    protected Float getFloatInput(Scanner in, String msg) {
        Float p = null;
        println(msg);
        try {
            p = in.nextFloat();
        } catch (InputMismatchException e) {
            final String err = "Invalid data entered, Please re-enter";
            println(err);
            throw new AccountException(err);
        }
        return p;
    }

    protected void println() {
        System.out.println();
    }

    protected void printOperation(String msg) {
        System.out.println("Operation : " + msg);
    }

    protected void println(String msg) {
        System.out.println(msg);
    }

    protected int printOperationGetIntInput(Scanner in, String operationMsg, String inputMsg) {
        printOperation(operationMsg);
        return getIntOperationInput(in, inputMsg);
    }

    protected float printOperationGetFloatInput(Scanner in, String operationMsg, String inputMsg) {
        printOperation(operationMsg);
        return getFloatOperationInput(in, inputMsg);
    }

    protected String printOperationGetStringInput(Scanner in, String operationMsg, String inputMsg) {
        printOperation(operationMsg);
        return getStringOperationInput(in, inputMsg);
    }

    protected boolean isNonEmpty(String p) {
        return p != null && !p.isEmpty();
    }

}
