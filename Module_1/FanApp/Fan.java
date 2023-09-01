/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Student 2021*/

package Module_1.FanApp;

public class Fan{
    //constants represent fan speed
    public static final int STOPPED=0;
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
     // private data fields
     private int speed;
     private boolean on;
     private double radius;
     private String color;

     //no argument constructor
     public Fan(){
        speed=STOPPED;
        on=false;
        radius=6.0;
        color="white";
     }//end no argument constructor
    
     //Argument constructor
      public Fan(int speed, boolean on, double radius, String color)
      {
        this.speed= speed;
        this.on= on;
        this.radius=radius;
        this.color=color;

     }//end argument constructor
     
     //Accessor and mutator methods
     public int getSpeed() // 1
     {
       return speed;
     }
     public void setSpeed(int speed)
     {
       this.speed= speed;

     }   

     public boolean isOn()//2
     {
        return on;
     }
    public void setOn(boolean on)
      {
       this.on=on;
      }
    
    public double getRadius()//3
    {
        return radius;
    }
    public void setRadius( double radius)
    {
        this.radius=radius;
    }
  
    public String getColor()//4
    {
        return color;
    
     }
     public void setColor(String Color)
     {
        this.color=Color;
     }
     // end accessor and mutator

     //override the toString method
     public String toString(){
     if (on) {
        return "The Fan Speed is set to "+ speed + " with a color of "+color+ "  and a radius of "+radius;
      } else {
         return "The Fan is "+ color +" with a radius of "+radius+ ",and the fan is off";
      }

        }

     }




       
    