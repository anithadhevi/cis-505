/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */


package Module_3.SaravananCustomerAccountApp;

import java.util.Scanner;

public class TestCustomerAccountApp 
{
  public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
        // Customer customer=null;
       
        // prompt the user to enter customer number between 1007 and 1009   
        System.out.println(" Welcome to the Customer Account App ");
        System.out.print("\n");
        System.out.println(" Enter a customer ID:");
        System.out.print("    ex: 1007,1008,1009>: ");   
        int customerID = scanner.nextInt();

        //Get customer information form customerDB
        Customer customer = CustomerDB.getCustomer(customerID);

        //create an Account object
        Account account = new Account();

        //Display menu and handles' user selection
        String option;
        boolean proceed=true;
        boolean wanttocontinue = false;
        do
        {
            account.displayMenu();
            //System.out.print("Enter option: ");
            option=scanner.next();
    
            //handle user's selection and invoke corresponding methods
            switch (option)
            {
                case "B":
                case "b":
                    System.out.printf("Account balance: $%,6.2f%n", account.getBalance());
                break;
        
                case "D":
                case "d":
                    System.out.print("\n");
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;

                case "W":
                case "w":
                    System.out.print("\n");
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                default:
                    System.out.println("Error: Invalid option");
                    break;
            }
            
            //Ask the user do you want to continue
            do
            {
                System.out.println("");
                System.out.print("Continue? (y/n): ");
                String continueOption = scanner.next().toLowerCase();
                
                if(continueOption.equalsIgnoreCase("N"))
                {
                    proceed=false;
                    wanttocontinue=false;
                }
                else if (!continueOption.equalsIgnoreCase("Y"))
                {
                    wanttocontinue = true;
                    System.out.println("Invalid option");
               }
               else
               {
                    wanttocontinue=false;
               }

            }
            while(wanttocontinue);
        }
        while (proceed);

        //display customer details and account balance
        System.out.println("\n--Customer Details--\n" +customer.toString());
        System.out.print("\n");
        System.out.printf("Balance as of %s is $%,6.2f%n", account.getTransactionDate(), account.getBalance());

        System.out.println("\nEnd of line...");
        scanner.close();
    }
         
}
