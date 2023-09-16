/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2021
    Java tutorials.,https://www.w3schools.com/java/
    */
/**
 *Assignment: Customer and Account Classes
 *Name: Saravanan
 *Date: 9/17/2023
 */

package Module_3.SaravananCustomerAccountApp;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer 
{
    //private data fields
    private String name;
    private String address;
    private String city;
    private String zip;
    
        //no argument constructor
    public Customer()
    {
        name="";
        address="";
        city="";
        zip="";
    }
        // end no argument constructor}
    
        //argument constructor
    public Customer(String name, String address,String city,String zip)
    {
        this.name=name;
        this.address=address;
        this.city=city;
        this.zip=zip;
     }
        //end of argument constructor

       //accessor methods 
    public String getName() //1
    {
        return name;
    }
    public String getAddress() //2
    {
        return address;
    }
    public String getCity()//3
    {
        return city;
    }
    public String getZip() //4
    {
        return zip;
    }
    // end of accessor methods

    //override the toString methods
    public String toString()
    {
        return "Name: " + name + "\nAddress: " + address + "\nCity: " + city + "\nZip: " + zip;
    }
}

