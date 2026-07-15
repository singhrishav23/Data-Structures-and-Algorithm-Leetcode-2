import java.util.*;

public class Pr5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("This pattern doesn't work for even numbers.");
            return;
        }


        int nst = 1;
        int nsp = n/2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n/2 + 1) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            
        }
    }
}
