/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */

package Module_3.SaravananCustomerAccountApp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account
{
    private double balance=200; //private data field for balance and the default is 200

       
        //accessor method for the balance data field
        public double getBalance() 
        {
            return balance;
        }
             // public method to deposit funds
        public void deposit(double amt)
        {
            balance = balance + amt;
        }
                //public method to withdraw funds
        public void withdraw(double amt)
        {
        
            if (balance >=amt)
            {
                balance = balance - amt;
            }
        
        }
            //public method to display menu  
        public void displayMenu()
        {
            System.out.print("\n");
            System.out.println("Account Menu");
            System.out.println("Enter <D/d> for deposit");
            System.out.println("Enter <W/w> for withdraw");
            System.out.println("Enter <B/b> for balance");
            System.out.print("   Enter option>: ");
        }   

        //public method to get the transaction date in the date format
        public String getTransactionDate()
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date currentDate = new Date();
            return dateFormat.format(currentDate);
        }
}


       
