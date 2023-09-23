/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Java tutorials.,https://www.w3schools.com/java/ */
package Module_4.BowlingShopApp;

import java.util.LinkedList;

public class GenericQueue<E>
{
    private LinkedList <E> list;//private generic list data field

    //constructor to initialize the list
    public GenericQueue()
    {
        list = new LinkedList<>();

    }
    
    //public method to enqueue an item to the list
    public void enqueue(E item)
    {
        list.addFirst(item);

    }

    //public method to dequeue and remove the first item from the list
    public E dequeue()
    {
        if (isEmpty())
        {
            throw new IllegalStateException ("Queue is empty");
        }
        return list.removeFirst();

    }
    //public method to get the size of the queue
    public int size()
    {
        return list.size();
    }
    
    //public method to check the queue is empty
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
}
