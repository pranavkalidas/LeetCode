package TopInterview150;

//80
public class DuplicateInSortedArrII {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int num: nums){
            if(index<2 || num > nums[index-2]){
                nums[index++] = num;
            }
        }
        return index;
    }
}