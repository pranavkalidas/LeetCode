package TopInterview150;

import java.util.Arrays;

public class MajortiyElements {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //Without sorting
    //Moore Voting Algorithm
    public static int majorityElement2(int[] nums) {
        int count = 1;
        int majorEle = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            count += nums[i] == majorEle ? 1 : -1;
            if (count == 0) {
                majorEle = nums[i];
                count++;
            }
        }
        return majorEle;

    }
}
