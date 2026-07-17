//5 --> Reverse a part of an Array

import java.util.Scanner;

public class ArraysA5 {

    public static void reverseArrayPart(int arr[], int start, int end){
        int sp = start;
        int ep = end;

        while (sp < end) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        } 
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int start = arr[2];
        int end = arr[5];

        reverseArrayPart(arr, start, end);
        printArray(arr);
    }
    
}