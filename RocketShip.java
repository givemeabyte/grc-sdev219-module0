// Name: 
// IT 219
// Core Topics: Creating a java program 
// with static methods
//
// This program will CALL a series 
// of static methods to display output to the console
// window which resembles a rocketship
public class RocketShip
{

   // remember - java always looks for the main method to begin execution
   public static void main(String[] args) 
   {
      // TODO: add your code here to call your methods 
      drawCone();
      
            
   } // end main method

   // informational method not to be used to create your rocketship
   public static void printPractice()
   {
      //print a single backslash
      System.out.println("\\");
      
      //print a single forward slash
      System.out.println("/");
      
      //print columns of info with tab
      System.out.println("Name\tAge\tFavorite Color");
      
      //print blank line
      System.out.println();
      
      //print quotes
      System.out.println("They said, \"I crave Java in the morning!\"");
   
   }
   // this method draws a single ascii box
   public static void drawBox() 
   {
   
     // TODO: add your System.out.println() calls here
   
   } // end method

   // this method draws a single ascii cone
   public static void drawCone()
   {
   
     // TODO: add System.out.println() calls here
      System.out.println("  /\\   ");
/*   /--\
  /----\
 /------\*/
   
   }// end method

   // this method draws an upside down ascii cone
   public static void drawReverseCone()
   {
   
     // TODO: add System.out.println() calls here

         
   } // end method
   
} // end class
/*
 ----jGRASP exec: java RocketShip
    /\
   /--\
  /----\
 /------\
 +------+
 |      |
 |      |
 +------+
 +------+
 |      |
 |      |
 +------+
 \------/
  \----/
   \--/
    \/
 
  ----jGRASP: operation complete.
*/