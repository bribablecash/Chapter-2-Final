
/**
 * Write a description of class CSStringPlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSStringPlay
{
     public static void main (String[] args)
   {
          String college = new String ("PoDunk College");
 
      String town = new String ("Anytown, USA"); // part (a)
 
          int stringLength = college.length();
          String change1, change2, change3;
 
          college.length(); // part (b)
 
          System.out.println (college + " contains " + stringLength + " characters.");
 
          change1 = college.toUpperCase(); // part (c)
 
          change2 = change1.replace('O', '*'); // part (d)
 
          change3 = college.concat(town); // part (e)
 
          System.out.println ("The final string is " + change3);
        }
}