//4 --> Find the Largest number
/*

  -infinity = Interger.min_value
  +infinity = Interger.max_value
 
*/
import java.util.*;

public class Arrays5 {

    public static int getSmallest (int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static int getLargest (int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("Largest value is : "+ getLargest(numbers));
        System.out.println("Smallest value is : "+ getSmallest(numbers));
        
    }
    
}
