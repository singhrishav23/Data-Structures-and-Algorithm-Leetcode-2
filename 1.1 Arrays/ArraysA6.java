//6 --> Rotate a Part of an Array

import java.util.Scanner;

public class ArraysA6 {

    public static void rotateArray(int arr[], int s, int e){

        int sp = s;
        int ep = e;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Array size i/p
        System.out.print("Enter size of an Arrays : ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];

        //Array element i/p
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Value of K
        System.out.print("Enter how many rotations you want (K) : ");
        int k = sc.nextInt();
        System.out.println();

        printArray(arr);
        rotateArray(arr, 0, n-1);
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k+1, n-1);
        printArray(arr);

    }
    
}
