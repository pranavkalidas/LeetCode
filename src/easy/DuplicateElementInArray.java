package easy;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,1,6,7,3,1} ;
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] nums) {
        //Insertion Sort
        for(int i=1; i<nums.length; ++i){
            int j = i;
            while(j>0 && nums[j]<=nums[j-1]){
                int temp = nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }
            if(j<nums.length-1 && nums[j]==nums[j+1]){
                return true;
            }
        }
        return false;
    }

}
