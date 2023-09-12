package Medium;

public class MinDelBeautifulArray2216 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3};
       // System.out.println(minDeletion(nums));
        System.out.println(minDeletion2(nums));
    }
    public static int minDeletion(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        int deletions = 0;
        int pos = 0;
        for(int i=1; i<nums.length;++i){
            if(pos%2==0 && nums[i-1]==nums[i]){
                deletions++;
            }
            else{
                pos++;
            }
        }
        if((nums.length-deletions)%2!=0){
            return ++deletions;
        }
        return deletions;
    }

    public static int minDeletion2(int[] nums){
        int res = 0, pre = -1;
        for (int a : nums) {
            if (a == pre)
                res++;
            else
                pre = pre < 0 ? a : -1;
        }
        return pre < 0 ? res : res + 1;


    }
}
