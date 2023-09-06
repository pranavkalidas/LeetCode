package easy;

public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0; i<nums.length; ++i){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }

    public int[] getConcatenationArrayCopy(int[] nums) {
        int[] arr = new int[nums.length*2];
        System.arraycopy(nums,0,arr,0,nums.length);
        System.arraycopy(nums,0,arr,nums.length,nums.length);
        return arr;
    }
}
