
/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/
    */
package Module_4.BowlingShopApp;

public class Ball extends Product
{
  private String color; //private data field
 
 // no argument constructor
    public Ball()
    {
       super(); // call superclass constructor
        this.color="";
    }
 
 //accessor and mutator
    public String getColor()
    {
        return color;
    }
   
    public void setColor(String color)
    {
    this.color= color;
    }
 //end of accessor and mutator
   
 //Override toString method
   public String toString()
    {
        return super.toString() + "\nColor: " + color;
    }
   



} 

