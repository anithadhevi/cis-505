/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
     Cyberactive., Instruction to Assignment 5.2.,
    https://learn-us-east-1-prod-fleet01-xythos.content.blackboardcdn.com/blackboard.learn.xythos.prod/5a31d48b683a8/20827739?X-Blackboard-S3-Bucket=blackboard.learn.xythos.prod&X-Blackboard-Expiration=1695859200000&X-Blackboard-Signature=EOMp4B91pq1a7tRqje5mwzKMYLW9EzNF9PvjUHqBRkA%3D&X-Blackboard-Client-Id=100225&X-Blackboard-S3-Region=us-east-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27Instructions%2520for%2520Assignment%25205.1.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEJv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJHMEUCIQCcuS5KyOcYzh8lKry1Cw7iu3Tg0B5WLjkFYt9PI%2Bo2HwIgETLRB58%2BaP2cJbXKUY0M16XHYGC9Wk6VHc0SRLXdEusquwUIlP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgw1NTY5MDM4NjEzNjEiDFgauJaQ2NDn1oyTqyqPBY%2Fkh7JJG7%2BLoAdDfEC1jzeT6DyQhfxFnKvn7I9klL4nsarXjTLijIYbPQTSXRqFjIFAhovRE6GKJB40uZ3o1zSjopnqeQmOSl9uSJfU0suftLPWlgDzy1bU%2FK3SjgEnq2dXJvtgKa63kEvsmW4%2FckDMOamHc511zZudey7%2BXvfGyQRdI6gggXHGOhg%2BKr0HefhwsvGxXH70EfHLbAuH1RlTGnQlPa9LMu9OlJwQJt6oZfhYF7%2BTAZCniBA71Lk2roZ74OxtvwZIhViSYPfRK94ySjvuoYpPlXr5a9jNqa1eu8KQz1EXkWkFanqO53kJQkJztKUNwldLyWM0ZEGdqte3sB%2BYJjrbkh1u0Sp5KmdcxGVTdxoarifbSl4xqmlRJZRsLqz%2FQzSUnRIZhhDzkMc1hXoepwNg8baQU%2Fy8QouJcqfQPv8tqTYHccEVf3cVwEb%2FsMjmRBym5rYVpCaJEMoX1q7XbJY5xdgUuxnZvcEJDo9sjpBKqOicbugUmC976taz23%2F3vXaELw0W6l7j3iiSpUa587Be2zXMSIVGnEf%2BS31qy15fioOrQsGOavOUTYn4yU%2BqMywsrU8kLKEfOKy4bABxNqZU6H3Pw7cD8sTCDpzCYFcK%2FGY7XhtoEMp5MXSpqRrX2CFGGPazfJHolpSM%2FdFAHyHZbIBckoxBIBTA3kaZlK5QGAzyAAhbuqyFAZQalUA7%2F4UVGfOMdvc%2BLubUHdEc%2FfPnJVkjv7g0oEXTTCg8oAvohsgLdsFBn6R7OUn%2BFL%2BFgr8GBbWxAR7hAN00AeU2XATfUG6QZcZgSoS7ezYEC3vrnxi6JZOtScijrKaPr9OBxTDR4Mb3qxi3zyPCuywLkA4BQaMyMVoGahgwhfbRqAY6sQHQKRS73hKYNpZjtnYp0%2FgBSeWp7SxT434M6kzNbh3bx0FLfSzheYfH%2FqescyNzaEn5e6EcEGh97L1gu4EBKkdjQW4sK9yH3TAHqwPLaun86V9eIe%2B%2FAn8jdAVUqSH3o36MI%2FAv7EaqedMplv%2B4CIk%2FUdlHNP7WCQgTWx7avD%2FN5RI6lx8znjCM%2BU9vdcezomso3XiaVqkq6b0YlWqS6MievDirz5z7bwpJSmXBphyKDec%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230927T180000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAYDKQORRY4CVC75TK%2F20230927%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=a256b0435fe41b82592f87e15ad8a8e28bca5d7214a1753944c4298d80a77f7a
    Java tutorials.,https://www.w3schools.com/java/ */

    package Module_5.ExpensesTracker;
    import java.util.Scanner;

public class ValidatorIO 
{
    public static Integer getInt(Scanner sc, String prompt)
    {
    
        Integer input = 0;// set input variable to 0
    
        boolean isValid = false;// set boolean is false

        while (!isValid)
        {
            System.out.print(prompt);
    
            if (sc.hasNextInt())
            {
                input = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("\nError! Invalid integer value.\n");
                isValid = false;
             // consume the invalid input
            }
            sc.nextLine();
        }
        return input;
    }
            
    
  public static double getDouble(Scanner sc, String  prompt)
    {
        double input = 0.0;
        
        boolean isValid = false;
            
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                input = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid double value ");
                isValid = false;
                // Consume the invalid input
            }
            sc.nextLine(); 
        }
        return input;
    }
    
     public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        return sc.next();
    
    }
}



