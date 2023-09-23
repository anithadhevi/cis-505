
/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */
package Module_4.BowlingShopApp;

public class ProductDB 
{
    public static GenericQueue<Product> getProducts(String code)
    {
      //define a generic queue to store the product 
      GenericQueue<Product> productlist = new GenericQueue<Product>();

       
      if (code.equalsIgnoreCase("b"))
        
      {
        Ball ball1=new Ball();
        ball1.setCode("B100");
        ball1.setDescription("Black Widow 2.0");
        ball1.setPrice(144.95);
        ball1.setColor("Black and Red");
        productlist.enqueue(ball1);
        
        Ball ball2= new Ball();
        ball2.setCode("B200");
        ball2.setDescription("Axiom Pearl");
        ball2.setPrice(154.95);
        ball2.setColor("Blue and Red");
        productlist.enqueue(ball2);
        
        Ball ball3=new Ball();
        ball3.setCode("B300");
        ball3.setDescription("Proton Physix");
        ball3.setPrice(174.95);
        ball3.setColor("Pink and Purple");
        productlist.enqueue(ball3);
        
        Ball ball4=new Ball();
        ball4.setCode("B400");
        ball4.setDescription("Force Unleashed");
        ball4.setPrice(139.99);
        ball4.setColor("Red and White");
        productlist.enqueue(ball4);
        
        Ball ball5=new Ball();
        ball5.setCode("B500");
        ball5.setDescription("Phaze III");
        ball5.setPrice(154.99);
        ball5.setColor("Purple and Green");
        productlist.enqueue(ball5);
      }
      else if(code.equalsIgnoreCase("a"))
      {
        Bag bag1 = new Bag();
        bag1.setCode("A100");
        bag1.setDescription("Path Pro Deluxe");
        bag1.setPrice(34.99);
        bag1.setType("Single");
        productlist.enqueue(bag1);

        Bag bag2 = new Bag();
        bag2.setCode("A200");
        bag2.setDescription("Prime Roller Black/Royal Blue");
        bag2.setPrice(54.99);
        bag2.setType("Double");
        productlist.enqueue(bag2);
        
        Bag bag3 = new Bag();
        bag3.setCode("A300");
        bag3.setDescription("Silver Royal Blue");
        bag3.setPrice(74.99);
        bag3.setType("Triple");
        productlist.enqueue(bag3);
      }
      else if(code.equalsIgnoreCase("s"))
      {
        Shoe shoe1 = new Shoe();
        shoe1.setCode("S100");
        shoe1.setDescription("Men's Ram Black");
        shoe1.setPrice(39.99);
        shoe1.setSize(10.5);
        productlist.enqueue(shoe1);
      
        Shoe shoe2 = new Shoe();
        shoe2.setCode("S200");
        shoe2.setDescription("Women's Rise Black/Hot Pink");
        shoe2.setPrice(39.99);
        shoe2.setSize(7.0);
        productlist.enqueue(shoe2);

        Shoe shoe3 = new Shoe();
        shoe3.setCode("S300");
        shoe3.setDescription("Women's Path Lite Seamless Mesh");
        shoe3.setPrice(54.99);
        shoe3.setSize(6.0);
        productlist.enqueue(shoe3);

        Shoe shoe4 = new Shoe();
        shoe4.setCode("S400");
        shoe4.setDescription("Men's Tribal White");
        shoe4.setPrice(26.99);
        shoe4.setSize(8.5);
        productlist.enqueue(shoe4);

        Shoe shoe5 = new Shoe();
        shoe5.setCode("S500");
        shoe5.setDescription("Youth Skull Green/Black");
        shoe5.setPrice(39.99);
        shoe5.setSize(3.0);
        productlist.enqueue(shoe5);
      }
      
      return productlist;
    }
}
