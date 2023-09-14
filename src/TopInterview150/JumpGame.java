package TopInterview150;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    //For recursion
    public static boolean helper(int[] nums, int[] reach, int index){
        if(reach[0]==1){
            return true;
        }
        if(index<0){
            return false;
        }
        for(int i=1; i<=nums[index]; i++){
            if(index+i>=nums.length-1 || reach[index+i]==1 ){
                reach[index] = 1;
                break;
            }
        }
        return helper(nums, reach, index-1);
    }
}
