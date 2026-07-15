import java.util.*;

public class Pr7 {

    public static void HollowRect(int tRows, int tCols){

        for (int i = 1; i <= tRows; i++) { //outer loop

            for (int j = 1; j <= tCols; j++) { //inner loop

                if (i == 1 || j == 1 || i == tRows || j == tCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }

            System.out.println();
            
        }

    }

    public static void main(String[] args) {

        HollowRect(4,5);
        
    }
    
}
