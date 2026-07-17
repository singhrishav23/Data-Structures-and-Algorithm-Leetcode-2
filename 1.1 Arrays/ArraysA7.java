//7 --> Given n elements, count total number of element having atleast 1 element greater than itself.

import java.util.Scanner;

public class ArraysA7 {

    public static int countMax(int arr[]){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        return arr.length-count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];

        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = countMax(arr);
        System.out.println(ans);
        
    }
    
}
