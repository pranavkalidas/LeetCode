package TopInterview150;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {7,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0]=1;
        for(int i=1; i<n; ++i){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int temp = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] = ans[i] * temp;
            temp = temp * nums[i];
        }
        return ans;
    }
}

/*
Recursion 1 (Left) | 1       | 1x7   | 1x7x2 | 1x7x2x3 |
Recursion 2 (right)| 2x3x4x1 | 3x4x1 | 4x1   | 1       |
 */