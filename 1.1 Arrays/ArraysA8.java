//8 --> Two Sum --> (arr[i] + arr[j] == k) return true, else false. Condition(i != j)

import java.util.Scanner;

public class ArraysA8 {

    public static boolean twoSum(int arr[], int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
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

        //key value --> k
        System.out.print("Enter key you want add(i,j) = ");
        int k = sc.nextInt();

        System.out.println(twoSum(arr, k));
    }
    
}
