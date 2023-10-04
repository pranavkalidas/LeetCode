package Contest.sept16;

import java.util.Arrays;
import java.util.List;

public class MinLengthAfterRemoval {
    public static void main(String[] args) {
        Integer[] arr = {1,1,3};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(minLengthAfterRemovals(list));
    }

    public static int minLengthAfterRemovals(List<Integer> nums) {
        int size = nums.size();
        int i = 0;
        int j = 1;
        while(i<nums.size() && j<nums.size()){
            if(nums.get(i)<nums.get(j)){
                size -= 2;
                i += 2;
                j += 2;
            }
            else{
                i++;
                j++;
            }
        }
        return size;
    }
}
