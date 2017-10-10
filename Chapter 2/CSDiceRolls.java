import java.util.Random;
/**
 * Write a description of class CSDiceRolls here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSDiceRolls
{
    public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          dice1 = Math.abs(generator.nextInt()) % 7;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          dice2 = Math.abs(generator.nextInt()) % 7;
 
          System.out.println ("Your dice numbers are " + dice1 + " and " + dice2);
        }
}
