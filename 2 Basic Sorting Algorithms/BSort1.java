//1 --> Bubble Sort

import java.util.*;

public class BSort1 {
    //Ascending to Descending
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) { //turns
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array size
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];

        //Array element i/p
        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        printArray(arr);
    }
    
}
