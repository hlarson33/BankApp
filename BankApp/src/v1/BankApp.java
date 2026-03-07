
package v1;
import java.util.Scanner;

/**
 * 
 * @author Hunter Larson
 *
 * @version 1.0 2026-03-06 Initial implementation
 *
 *
 * @since 1.0
 */
public class BankApp
    {                                                               
                                                                                    
    public static void main( String[] args )
        {
        //creates Scanner and constructor
        Scanner input = new Scanner(System.in);
        
        //creates bank account
        BankAccount b = new BankAccount();
        
        //turns the program on 
        boolean running = true;
        while (running) {
            //menu
            System.out.printf("1) Deposit %n2) Withdraw %n3) Print History %n4) Show Balance %n0) Exit %n");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            //switch statement to read user selection
            switch (choice) {
                case 1: { 
                    //deposit
                    System.out.println("Enter amount: ");
                    double amount = input.nextDouble();
                    System.out.println("Enter note: ");
                    input.nextLine();
                    String note = input.nextLine();
                    boolean x = b.deposit(amount , note);
                    //check if deposit valid
                    if (!x) {
                        System.out.println("Invalid deposit");
                        }
                    break;
                    }
                
                case 2: {
                    //withdraw
                    System.out.println("Enter amount: ");
                    double amount = input.nextDouble();
                    System.out.printf("%nEnter note: %n");
                    input.nextLine();
                    String note = input.nextLine();
                    boolean x = b.withdraw(amount , note);
                    //check if withdraw valid
                    if (!x) {
                        System.out.println("Withdraw failed");
                        }
                    break;
                    }
                
                case 3: {
                    //print history
                    b.printHistory();
                    break;
                    }
                
                case 4: {
                    //show balance
                    System.out.println("Current Balance: " + b.getBalance());
                    break;
                    }
                
                case 0: {
                    //exit
                    running = false;
                    break;
                    }
                
                default: {
                    //invalid input
                    System.out.println("Invalid choice.");
                    break;
                    }
                }
            }
        
        input.close();
        
        }

    }
   // end class BankApp