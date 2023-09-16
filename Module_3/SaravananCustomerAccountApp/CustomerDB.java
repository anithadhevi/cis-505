/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan student 2021
    Java tutorials.,https://www.w3schools.com/java/*/
package Module_3.SaravananCustomerAccountApp;

public class CustomerDB 
{
    //public static method to get a customer by ID
    public static Customer getCustomer(Integer ID)
    {
        if (ID == 1007)
        {
            return new Customer("Jennifer Patterson","8422 Grover Ave.","Bellevue","68123");
        }
        else if(ID == 1008)
        {
            return new Customer("John Doe","123 Subway Street","Clarksville","24567");
        }
        else if(ID == 1009)
        {
            return new Customer("Sarah Smith","456 Elliot Way","Franklin","46757");
        }
        else
        {
            return new Customer();//Return a default customer for unknown IDS
        }
    
    }

       

}
