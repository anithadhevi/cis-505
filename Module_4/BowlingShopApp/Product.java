/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/
    */
package Module_4.BowlingShopApp;

public class Product 
{
    //private data field
    private String code;     
    private String description;  
    private double price;       

 // no argument constructor
    public Product()
    {
        this.code="";
        this.description="";
        this.price=0.0;
    }

 // accessor and mutator
    public String getCode() //1
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code= code;
    } 

    public String getDescription()//2
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description=description;

    }

    public double getPrice()//3
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
     //end of accessor and mutator methods

     //Override the toString methods
     public String toString()
     {
        return  "Product code: " + code + "\nDescription: " + description + "\n" + String.format("Price: $%,6.2f", price);
     }
}
