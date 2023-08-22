package easy;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersByNumberOfOneBits {
        public static void main(String[] args) {
            int[] arr = {0,1,2,3,4,5,6,7,8};
            Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(nums, Comparator.comparingInt(Integer::bitCount));
            arr =  Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
            System.out.println(Integer.bitCount(1024));
        }
}
