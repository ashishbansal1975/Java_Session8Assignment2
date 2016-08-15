import java.util.*;
public class Session8Assignment2
{
    public static void main(String [] args) 
    {
         // Create a HashSet
         HashSet<String> hset = new HashSet<String>();
 
         //add elements to HashSet
         hset.add("Chaitanya");
         hset.add("Ramesh");
         hset.add("Birbal");
         hset.add("Siddharth");
         hset.add("Himani");
         hset.add("Rajeev");
        

      //use hasNext() and next() methods of Iterator to iterate through the elements
        System.out.println("Iterating through HashSet elements...");
         Iterator<String> it = hset.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());
         }
          
      }
}