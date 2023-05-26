import java.util.*;

public class trappingrainWatr { //logic starts from here
    public static int trapRainWtr(int height[]){ // arg is a integer arry height
        int n = height.length;
        // calc- left max bound -- array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];// as there is nothing to the left of the building
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);// comparing with the current height
            
        }

        // cal- right max bound array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){// starts from n-2 as for n-1 the boungdry has already been calculated
            rightMax[i] = Math.max(height[i], rightMax[i+1]);// 
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
            }
            return trappedWater;
        }





    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapRainWtr(height));

    }
    
}
