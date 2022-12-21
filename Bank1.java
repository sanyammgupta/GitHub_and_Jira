//Question 1: Define a class to represent a bank account. It should have following data members:
//Account number
//Name of customer
//Balance
//Rate of interest
//It should have following methods:
//To deposit an amount
//To withdraw an amount, after checking if minimum account balance after withdrawal is Rs. 5000.
//To get rate of interest
//To display account details
//Write proper constructors initializing various data members.


import java.io.*;
import java.util.Scanner;
import java.util.Random; 


public class Bank1 {

    public int accNumber;
    public String customerName;
    public double balance;

    public void assignValues(String customerName, double balance){
        this.customerName=customerName;
        this.balance=balance;
        
        Random random = new Random();
        this.accNumber=random.nextInt(10000000);
        System.out.println("Your Account number is: "+accNumber);
    }
    public void depositAmount(double amount){
        if(accNumber==0)
            System.out.println("Your bank account does not exist, Please make one to continue.");
        else{
            balance+=amount;
            System.out.println("Amount deposited Successfully!");

        }
    }
    public void withdrawAmount(double amount){
        if(accNumber==0)
            System.out.println("Account does not exist please make one to continue");
        else if(balance>amount & (balance-amount)>5000){
            balance-=amount;
            System.out.println("Amount credited successfully!");
        }
        else
            System.out.println("Insufficient Balance!");
    }
    public void displayDetails(){
        if(accNumber==0)
            System.out.println("Account does not exis please make one to continue.");
        else
        {
            System.out.println("Name of Depositor: "+customerName);
            System.out.println("Balance amount is: "+balance);
            System.out.println("Rate of Interest is: 5%");
        }
    }
    public void getInput()
    {
        System.out.println("How can Nagarro Bank help you?");
        System.out.println("1. To Open an account");
        System.out.println("2. Show Account details");
        System.out.println("3. To Deposit the amount");
        System.out.println("4. To Withdraw the amount");
        System.out.println("5. Exit");
        System.out.print("Please choose the any of the above option: ");
    }
}
class  Main 
{
    public static void main(String[] s)  throws IOException
    {
        System.out.println("NAGARRO BANK");
        Bank1 newAccount=new Bank1();
         
        try (Scanner scan = new Scanner(System.in)) {
            int continueState=0;
             
            while(continueState==0){
                newAccount.getInput();
                int currentProcess=scan.nextInt();
                 
                if(currentProcess==1)
                {
                    System.out.print("Enter your name: ");
                    String customerName=scan.next();
                    System.out.print("Enter your opening balance: ");
                    double  balance=scan.nextDouble();
                    newAccount.assignValues(customerName, balance);
                }
                else if(currentProcess==2)
                {
                    newAccount.displayDetails();
                }
                else if(currentProcess==3)
                {
                    System.out.print("Enter amount to deposit: ");
                    newAccount.depositAmount(scan.nextDouble());    
                }
                else if(currentProcess==4)
                {
                    System.out.print("Enter amount to withdraw: ");
                    newAccount.withdrawAmount(scan.nextDouble());                    
                }
                else if(currentProcess==5)
                {
                    continueState=1;
                    System.out.println("THANK YOU FOR CHOOSING NAGARRO BANK!");
                }
 
                System.out.print ("press 0 to continue... ");
                continueState=scan.nextInt();

            }
        }
    }
}