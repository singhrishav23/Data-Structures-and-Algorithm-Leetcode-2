//3 --> Linear Search with Numbers
// int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
// int key = 20;

import java.util.Scanner;

public class Arrays3 {

    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = arr[2];
        int index = linearSearch(arr, key);
        
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Index of Key is : " + index);
        }
    }
    
}
