public class HelloWorld
{// open class

   // main method is called for us - 
   // defining the main method here
   // def is the way you do it in Python
   
   public static void main(String[] args)
   { // open main method
   
        // put code here
        System.out.println("Hello"); // every java statement ends in a semi-colon
        System.out.println("World");
        
        // call drawBox() method 5 times
        /*
        drawBox();
        drawBox();
        drawBox();
        drawBox();
        drawBox();
        */
        
        // better way is to use a for loop to call drawBox()
        for (int count = 1; count <= 5; count=count+1  )
        {
           drawBox();
        
        } // end of for loop
        
        // TODO: Call your new method (drawCup)
        
        
   } // close main method
   
   // Create/Define a method called drawCup that prints the ASCII characters
   // like this
   /*
         |     | 
         |     |
        *********
   */
   
   
   // this method will print an ASCII box
   // define the method
   public static void drawBox()
   {
       System.out.println("-------");
       System.out.println("|     |");
       System.out.println("|     |");
       System.out.println("-------");
   
   } // end of drawBox() method/function

}// end of class


/* Copy and Paste the Output
 ----jGRASP exec: java HelloWorld
 Hello
 World
 -------
 |     |
 |     |
 -------
 -------
 |     |
 |     |
 -------
 -------
 |     |
 |     |
 -------
 -------
 |     |
 |     |
 -------
 -------
 |     |
 |     |
 -------
 
  ----jGRASP: operation complete.
  
 */