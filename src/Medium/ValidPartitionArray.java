package Medium;

public class ValidPartitionArray {
    public static void main(String[] args) {
        int[] arr = {4,4,4,5,6};
        System.out.println(validPartition(arr));
    }

    public static boolean validPartition(int[] nums) {
        boolean isValid = false;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                count = 1;
            }
            //if(count == 2 || count == 3)
        }
        if(isValid){
            return true;
        }
        return false;
    }
}
