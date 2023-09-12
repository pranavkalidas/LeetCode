package easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffOfTwoArray2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        set1.forEach(System.out::println);
//        set1.
//        set2.forEach(System.out::println);
    }
}
