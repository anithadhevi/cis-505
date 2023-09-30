/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */
    
package Module_5.ExpensesTracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction 
{ 
    private String date;
    private String description;
    private double amount;

    // no argument constructor
    public Transaction()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = dateFormat.format(new Date());
        this.description = ""; 
        this.amount = 0.0;
    }
    //end of no argument constructor
 
    //Argument constructor that creates transactions using three data field
    public Transaction(String description, double amount)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = dateFormat.format(new Date());
        this.description=description;
        this.amount=amount;
    } 
    
    // end of argument constructor
   
    public String getDate()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }    
    public void setDate(String date) //1
    {
        this.date = date;
    }
     
    public String getDescription()//2
    {
        return description;
    }
    public void setDescription(String description) //2
    {
        this.description = description;
    }

    public double getAmount()//3
    {
        return amount;
    }
    public void setDouble(double amount) //3
    {
        this.amount=amount; //3
    }
    //end of accessor and mutator

    //Override the toString method
    public String toString()
    {
        return "Date: " + date + "\nDescription: " + description + "Amount: " + amount ;
    }
}


