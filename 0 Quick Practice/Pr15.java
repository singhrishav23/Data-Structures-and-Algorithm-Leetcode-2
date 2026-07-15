import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Pr15 {

    public static void NumPyramid(int n) {

        int counter = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
            }

            counter++;
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumPyramid(n);
    }
    
}
