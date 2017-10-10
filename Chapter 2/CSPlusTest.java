
/**
 * Write a description of class CSPlusTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSPlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         //The book would print both strings and make it one
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         System.out.println ("8 plus 5 is " + 8 + 5);
         //makes 85 since not in () 
         System.out.println ("8 plus 5 is " + (8 + 5));
         //adds to 13
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //adds to 13 since starts with numbers and then goes to a string 
        }
}
