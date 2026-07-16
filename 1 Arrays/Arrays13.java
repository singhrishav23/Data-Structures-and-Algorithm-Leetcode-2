//13 --> Trapping Rainwater (Medium lv.)

public class Arrays13 {

    public static int TRainWater(int height[]){
        int n = height.length;

        //leftMax Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //RightMax
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLv = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLv - height[i];
        }

        return trapWater;


    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TRainWater(height));
    }
    
}
