 /*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by A. Student 2021*/
 
public class SaravananHelloWorld
 {
/*method with two argument, which are used to print the "Hello world from first name and last name"
 *@param firstName string
 *@param lastName string
 *@return prints the result to the console window*/

    public static void Hello(String firstName, String lastName)
        {
            System.out.printf(String.format("Hello World from %s %s",firstName,lastName));
        }// end Hello
        
        public static void main (String [] args)
        {
         Hello("Anithadhevi","Saravanan");// call the Hello() method with the values
        }// end main
  }  //end code HelloWorld
  