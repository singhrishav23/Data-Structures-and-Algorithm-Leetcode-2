import java.util.*;

public class Pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n/2 + 1;
        int nsp = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nst; j++) { //1st line 1st half
                System.out.print("*");
            }

            for (int j = 1; j <= nsp; j++) { //Mid
                System.out.print(" ");
            }

            for (int j = 1; j <= nst; j++) { //1st line 2nd half
                System.out.print("*");
            }
            
            if (i < n/2 + 1) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }
}
