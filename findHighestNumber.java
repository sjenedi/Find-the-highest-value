import java.util.Random;

/**
 * 
 * @author Sami Jenedi
 *
 */
public class findHighestNumber {

  public static void main(String[] args) {
    final int MAX = 100;
    final int MIN = -100;
    
    Random rnd =  new Random();
    
    int highest[] = new int[10];
     
    for (int i = 0; i < highest.length; i++) {
      highest[i] = rnd.nextInt(MAX - MIN + 1) + MIN;
      System.out.println( i + ".  index: " + highest[i] ); 
      } 
      System.out.println( "The maximum value in the array is: " + findHighest(highest)); 
    }
  
    static int findHighest(int findHighestNumber[]) { 
    int max = findHighestNumber[0];
    for (int i = 0; i < findHighestNumber.length; i++) {
      if(findHighestNumber[i] > max) {
        max = findHighestNumber[i];
      }
    }   
    return max;
    }
  }


