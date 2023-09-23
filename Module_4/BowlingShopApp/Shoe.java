/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */
package Module_4.BowlingShopApp;

public class Shoe extends Product
{
  private double size; // private data fields    
 
 // no argument constructor
 public Shoe()
 { 
    super();// call super class constructor
    this.size = 0.0; 
 }
 // end of argument constructor

 //accessor and mutator
 public double getSize()
 {
    return size;
 }
 public void setSize(double size)
 {
    this.size=size;
 }
 // end of accessor and mutator

 //Override
 public String toString()
 {
    return super.toString() +"\nSize: " +size;
 }


}



