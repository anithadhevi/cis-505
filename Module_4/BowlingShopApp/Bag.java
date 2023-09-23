/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */
    
package Module_4.BowlingShopApp;

public class Bag extends Product
 {
    private String type;

 // no argument constructor
   public Bag ()
   {
    super();// call super class constructor
    this.type="";
   }
 // end of argument constructor
 
 // accessor and mutator
 public String getType()
 {
    return type;
 }
 public void setType(String type)
 {
    this.type=type;
 }
 // end of accessor and mutator

 //Override to toString method
  public String toString ()
  {
    return super.toString() +"\nType: " + type;
  }
}


