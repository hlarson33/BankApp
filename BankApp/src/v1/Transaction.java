
package v1;


/**
 * 
 * @author Hunter Larson
 *
 * @version 1.0 2026-03-04 Initial implementation
 *
 *
 * @since 1.0
 */
public class Transaction {
    
    //data fields 
    private String type;
    private double amount;
    private String note;
    private long time;
    private double balanceAfter;
    
    //Constructor to input type, amount, note, time and balance after transaction
    public Transaction(String newType, double newAmount, String newNote, double newBalanceAfter) {
        type = newType;
        amount = newAmount;
        note = newNote;
        balanceAfter = newBalanceAfter;
        time = System.currentTimeMillis();
        }
    
    //getters
    public String getType() {
        return type;
        }
   
    public double getAmount() {
       return amount;
       }
    
    public String getNote() {
        return note;
        }
    
    public long getTimestamp() {
        return time;
        }
    
    public double getBalance() {
        return balanceAfter;
        }
    }
   // end class Transaction