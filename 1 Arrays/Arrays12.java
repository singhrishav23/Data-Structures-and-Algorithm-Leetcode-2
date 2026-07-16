//11 --> Max Subarray Sum by Kadanes Algorithm (For +ve output only)
// TC = O(n), No extra memory is used here.

public class Arrays12 {

    public static void Kadanes(int numbers[]){

        int cSum = 0; //Current Sum
        int mSum = Integer.MIN_VALUE; //Max Sum

        for (int i = 0; i < numbers.length; i++) {
            cSum = cSum + numbers[i];

            if (cSum < 0) {
                cSum = 0;
            }
            mSum = Math.max(cSum, mSum); //cSum or mSum, jo bhi maximum hoga woh mSum me store ho jayega
        }

        System.out.println("Max Subarray Sum : " + mSum);

    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);
    }
    
}
