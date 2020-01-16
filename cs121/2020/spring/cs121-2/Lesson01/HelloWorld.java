/**
 * This is a program that prints Hello World!
 * It also demonstrates string concatenation, escape sequences, variables
 * and constants.
 *
 * @author Marissa Schmidt
 * @version CS121-001, Spring 2020
 */
public class HelloWorld
{
  public static void main(String[] args)
  {
    System.out.println("Hello World");
    System.out.println("Goodbye World");

    System.out.println();
    System.out.println("");
    System.out.println("Peanut butter " + "and" + " jelly");

    System.out.println("This is a really long line that will go off the end of the screen and annoy people reading your code because they will have to scroll to see it");

    System.out.println("This is a really long line that will go off the end of " +
                       "the screen and annoy people reading your code because " +
                       "they will have to scroll to see it");

    System.out.println("My dog is " + 5 + " years old");
    
    System.out.println("My dog is " + 5 + 2 + " years old");

    System.out.println("My dog is " + (5 + 2) + " years old");

    System.out.println("\tI said \"Hello\" to you");
    
    System.out.println("a\nb\nc\n");
    
    System.out.println("c:\\\\Home\\Marissa");
    
    String name = "Norman";
  
    System.out.println("Hello " + name);
    System.out.println("Goodbye " + name);
    
    name = "Snoopy";
    
    System.out.println("Have a great day, " + name);
 
    final String AUTHOR = "Marissa";
    final String BORDER = "================";

    System.out.println(BORDER);
    System.out.println("Created by :" + AUTHOR);
    System.out.println(BORDER);
  }
}
