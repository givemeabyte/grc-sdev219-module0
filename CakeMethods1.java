// Name: Susan Uland
// IT 219
// Core Topics: Creating a java program with static methods
//
// This program will call a series of static methods to 
// display ASCII cake art to the console window

public class CakeMethods1
{

   public static void main(String[] args)
   {
      cake1();
      cake2(); 
      cake3();   
            
   } // end of main

   // this method draws icing 
   public static void decoration()
   {
      System.out.println("     @@@@@");
      System.out.println(" @@@@@@@@@@@@@");
   }

   // Add a NEW method vanilla
   public static void vanilla()
   {
      System.out.println(" |  vanilla  |");
      // call pedestal() here
      pedestal();

   }
   
   // Add a NEW method strawberry
   public static void strawberry()
   {
   
      System.out.println(" | strawberry|");
      vanilla();

   }
   // TODO: this method will need to change to reduce
   // code redundancy
   public static void cake1()
   {
       decoration();
       vanilla();
   }

   // TODO: this method will need to change to reduce
   // code redundancy
   public static void cake2()
   {
       decoration();
       System.out.println(" |~*~*~*~*~*~|");
       strawberry();
   }

   //TODO: this method will need to change to reduce
   // code redundancy
   public static void cake3()
   {
       decoration();
       System.out.println(" |,.,.,.,.,.,|");
       System.out.println(" | chocolate |");
       strawberry();
   }

   // this method draws the stand the cake sits upon
   public static void pedestal()
   {
      System.out.println(" *************");
      System.out.println("      ) (");
      System.out.println("/-------------\\");
      System.out.println();
   }
} // end of class

/*
   The above program will produce the output below:

      @@@@@
  @@@@@@@@@@@@@
  |  vanilla  |
  *************
       ) (
 /-------------\

      @@@@@
  @@@@@@@@@@@@@
  |~*~*~*~*~*~|
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\

      @@@@@
  @@@@@@@@@@@@@
  |,.,.,.,.,.,|
  | chocolate |
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\

*/

/*

 ----jGRASP exec: java CakeMethods1
      @@@@@
  @@@@@@@@@@@@@
  |  vanilla  |
  *************
       ) (
 /-------------\
 
      @@@@@
  @@@@@@@@@@@@@
  |~*~*~*~*~*~|
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\
 
      @@@@@
  @@@@@@@@@@@@@
  |,.,.,.,.,.,|
  | chocolate |
  | strawberry|
  |  vanilla  |
  *************
       ) (
 /-------------\
 
 
  ----jGRASP: operation complete.

*/