import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
    //Creating data members(private) getters and setters required to access
    private int customerNumber;
    private int pinNumber;
    private double currentBalance = 0;
    private double savingBalance = 0;

    //Creating scanner obj
    Scanner input = new Scanner(System.in);
    //Class to Denote what kind of money you have
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    //setters getters
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public double getcurrentBalance(){
        return currentBalance;
    }

    public double getsavingBalance(){
        return savingBalance;
    }


    //method to withdraw money from current account
    public double calccurrentWithdraw(double amount){
        currentBalance = (currentBalance-amount);
        return currentBalance;
    }

    //method to withdraw money from saving account
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance-amount);
        return savingBalance;
    }
    //method to deposit money to current account
    public double calccurrentDeposit(double amount){
        currentBalance = (currentBalance+amount);
        return currentBalance;
    }
    //method to deposit money to saving account
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance+amount);
        return savingBalance;
    }


    //Withdraw funds from current Account
    public void getcurrentWithdrawInput(){
        //Checks account balance
        System.out.println("current Account Balance "+ moneyFormat.format(currentBalance));

        System.out.println("Amount you want to WithDraw from current account: ");

        //Take's user input of amount to be withdrawn
        double amount = input.nextDouble();
    
        //condition to check if amount user inputed is smaller than current account balance
        if((currentBalance - amount)>=0){

            //if amount small than current balance.Call calccurrentWithdraw method
            calccurrentWithdraw(amount);

            //Prints updated account balance
            System.out.println("New current Account Balance is "+ moneyFormat.format(currentBalance));
        }
        else{
            System.out.println("Balance cannot be negeative "+ "\n");
        }
    }

    //Withdraw funds from Saving Account
    public void getSavingWithdrawInput(){
        //Checks account balance
        System.out.println("Saving Account Balance "+ moneyFormat.format(savingBalance));


        System.out.println("Amount you want to WithDraw from Saving account: ");

        //Take's user input of amount to be withdrawn
        double amount = input.nextDouble();

        //condition to check if amount user inputed is smaller than current account balance
        if((savingBalance - amount)>=0){

            //if amount small than current balance.Call calcSavingWithdraw method
            calcSavingWithdraw(amount);

            //Prints updated account balance
            System.out.println("New Saving Account Balance is "+ moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be negeative "+ "\n");
        }
    }

    //Deposit funds to current Account
    public void getcurrentDepositInput(){

        //Prints current account balance
        System.out.println("current Account Balance is "+ moneyFormat.format(currentBalance));


        System.out.println("Amount you want to Deposit from current Account ");

        //Take's user input of amount to be deposited
        double amount = input.nextDouble();


        //condition to check if amount user inputed is positive 
        if((currentBalance + amount)>=0){

            //if amount positive.Call calccurrentDeposit method
            calccurrentDeposit(amount);

            //Prints account updated balance
            System.out.println("New current Account Balance is "+ moneyFormat.format(currentBalance));
        }
        else{
            System.out.println("Balance cannot be negeative "+"\n");
        }
    }

    //Deposit funds to Savings Account
    public void getSavingDepositInput(){

        //Prints savings account balance
        System.out.println("Saving Account Balance is "+ moneyFormat.format(savingBalance));


        System.out.println("Amount you want to Deposit from Saving Account ");

        //Take's user input of amount to be deposited
        double amount = input.nextDouble();

        //condition to check if amount user inputed is positive 
        if((savingBalance + amount)>=0){

            //if amount positive.Call calcSavingDeposit method
            calcSavingDeposit(amount);

            //Prints account updated balance
            System.out.println("New Saving Account Balance is "+ moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be negeative "+"\n");
        }
    }

}
