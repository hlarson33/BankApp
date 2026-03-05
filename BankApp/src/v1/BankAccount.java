
package v1;
import java.util.ArrayList;

/**
 * 
 * @author Hunter Larson
 *
 * @version 1.0 2026-03-04 Initial implementation
 *
 *
 * @since 1.0
 */
public class BankAccount
    {
    //data fields
    private double balance;
    private ArrayList<Transaction> history;
    
    //constructor that initializes the history list
    public BankAccount() {
        balance = 0;
        history = new ArrayList<>();
        }
    //getter for balance
    public double getBalance() {
        return balance;
        }
    //deposit method that lets you deposit a positive amount of money into the account
    public boolean deposit(double amount, String note) {
        //checks if the amount is valid
        if (amount <= 0) {
            return false;
            }
        //adds the amount to total balance
        balance += amount;
        //creates a transaction and adds it to history
        Transaction t = new Transaction("DEPOSIT", amount, note, balance);
        history.add( t );
        return true;
        }
    public boolean withdraw(double amount, String note) {
        //check if amount is valid
        if (amount <= 0) {
            return false;
            }
        //check if it's an overdraft
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
            }
        //subtracts amount from total balance
        balance -= amount;
        //creates a transaction and adds it to history
        Transaction t = new Transaction("WITHDRAW", amount, note, balance);
        history.add( t );
        return true;
        }
    //method for printing the transaction history oldest to newest
    public void printHistory() {
        System.out.println("--- Transaction History ---");
        //goes through every index in the history list and prints
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
            }
        //gives total balance at the end
        System.out.println("Current balance: " + getBalance());
        }
    }
   // end class BankAccount