//1 --> Arrays (Input/Output)

import java.util.Scanner;

public class ArraysA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];

         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }

         System.out.println();
        
    }
}