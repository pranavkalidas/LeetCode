package TopInterview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {1,-1,-1,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length -1;
        int num = 0;
        while(i < j){
            int k = (i+j)/2;
            while( (i < k) && ((nums[i] + nums[j] + nums[k]) < num) ){
                i++;
            }
            while( (j > k) && ((nums[i] + nums[j] + nums[k]) > num) ){
                j--;
            }
            if(i<k && j>k && (nums[i]+nums[j]+nums[k]) == num){
                List<Integer> temp = Arrays.asList(nums[i], nums[k], nums[j]);
                list.add(temp);
                i++;
                j--;
            }

        }
        return list;
    }
}
