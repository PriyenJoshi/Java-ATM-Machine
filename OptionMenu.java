//import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

//Creating child class of Account
public class OptionMenu extends Accounts {
    Scanner menuInput = new Scanner(System.in);
    //Class to Denote what kind of money you have
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //Creating new HashMap named data
    HashMap <Integer,Integer> data = new HashMap<>();
    
    //Login method of user
    public void getLogin() throws Exception{

        //*****//declaring a variable for while loop*****/// Search
        int x = 1;
        //Declaring a do-while loop
        do{
            //Writing in try catch block to for error handling
            try{
                //adding data to hashmap
                data.put(1234, 12345);
                data.put(1234, 12345);

                System.out.println("Welcome to ATM Project");
                System.out.println("Enter your customer Number");

                //CustomerNumber passed into below method called in accounts class
                setCustomerNumber(menuInput.nextInt());

                //PinNumber passed into below method called in accounts class
                System.out.println("Enter your Pin");
                setPinNumber(menuInput.nextInt());
            }
            //If customerNumber and pinNumber wrong catch statement handles the error
            catch(Exception e){
                System.out.println("\n"+ "Invalid Character. Only Numbers"+"\n");
                x=2;
            }

            //stores user input into var
            int cn = getCustomerNumber();
            int pn = getPinNumber();

            //validation check
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            }
            else
                System.out.println("\n"+ "Wrong Customer Number or Pin Number "+ "\n");
            } while (x==1);
    }

    //Display's types of accounts
    public void getAccountType(){
        //Displays menu options of account types
        System.out.println("Select Account you want to access ");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        //taking input from user and storing in var
        int selection = menuInput.nextInt();

        //Running switch case for user desired input
        switch(selection){
        case 1:
            //Calling getcurrent Account type
            getcurrent();
            break;

        case 2:
            //Calling getSaving Account type
            getSaving();
            break;

        case 3:
            System.out.println("Thank you for using ATM!");
            break;

        default:
            System.out.println("\n" + "Invalid choice"+ "\n");
            //calling the same method again
            getAccountType();
        }
    }

    //Displaying options for method of current Account Type
    public void getcurrent(){
        System.out.println("current Account ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        //taking input from user and storing in var
        int selection = menuInput.nextInt();

        //Running switch case for user desired input
        switch(selection){
            case 1:
            //calling getcurrentBalance method from Accounts class(Parent class) which displays account balance
            System.out.println("current Account Balance "+ moneyFormat.format(getcurrentBalance()));
            //Calling Account Type's display  method
            getAccountType();
            break;

            case 2:
            //calling getcurrentWithdrawInput method from Accounts class(Parent class)
            getcurrentWithdrawInput();
            //Calling Account Type's display  method
            getAccountType();
            break;

            case 3:
            //calling getcurrentDepositInput method from Accounts class(Parent class)
            getcurrentDepositInput();
            //Calling Account Type's display  method
            getAccountType();
            break;

            case 4:
            System.out.println("Thank you for using ATM! ");
            break;

            default:
            System.out.println("\n"+ "Invalid choice "+ "\n");
            //call the method itself to display current account options
            getcurrent();
        }
    }
    //Displaying options for method of Saving Account Type
    public void getSaving(){
        //Displaying options for method of current Account Type
        System.out.println("Saving Account ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice");

        //taking input from user and storing in var
        int selection = menuInput.nextInt();

        //Running switch case for user desired input
        switch(selection){
        case 1:
            //calling getsavingBalance method from Accounts class(Parent class) which displays saving account balance
            System.out.println("Saving Account Balance "+ moneyFormat.format(getsavingBalance()));
            //Calling Account Type's display  method
            getAccountType();
            break;

        case 2:
            //calling getSavingWithdrawInput method from Accounts class(Parent class)
            getSavingWithdrawInput();
            //Calling Account Type's display  method
            getAccountType();
            break;

        case 3:
            //Calling getSavingDepositInput from Accounts class(Parent Class)
            getSavingDepositInput();
            //Calling Account Type's display  method
            getAccountType();
            break;

        case 4:
            System.out.println("Thank you for using ATM! ");
            break;

        default:
            System.out.println("\n"+ "Invalid choice "+ "\n");
            //call the method itself to display current account options
            getcurrent();
        }
        
    }


}
