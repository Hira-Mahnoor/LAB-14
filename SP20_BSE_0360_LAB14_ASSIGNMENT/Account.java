
package SP20_BSE_0360_LAB14_ASSIGNMENT;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable {
    private String AccountNumber;
    private int balance;
    Scanner input= new Scanner(System.in);

    public Account(String AccountNumber, int balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(String AccountNumber){
        System.out.println("enter amount to deposit: ");
        int amount;
        
        Scanner input= new Scanner(System.in);
        amount=input.nextInt();
        this.balance += amount;
        System.out.println("Total balance is: "+ balance);
    }
    public void withdraw(String AccountNumber){
        System.out.println("Enter the amount to withdraw");
        int amount;
        amount = 500;
       amount=input.nextInt();
        if(amount <= balance){
            balance -=amount;
            System.out.println("the withdraw money is"+ amount +"total balance is"+ balance);
        }
        else{
            System.out.println("withdraw money failed");
        }
}
    public void transfer(String AcountNumber, Account acc){
        System.out.println("enter the amount to transfer");
        int amount;
        amount =900;
        amount=input.nextInt();
        if(this.balance<amount){
            System.out.println("transfer fails");            
        }
        else{
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of"+this.AccountNumber + "balance is"+this.balance);
            System.out.println("Acount of "+acc.AccountNumber+ "Balance is"+ acc.balance);
        }    
    }
    public void balanceInquiry(String AccountNumber){
        System.out.println("The total amount in this account is"+ getBalance());
    }
    @Override
    public String toString() {
        return "Account{" + "AccountNumber=" + AccountNumber + ", balance=" + balance + '}';
    }
    
    
    
    
}
