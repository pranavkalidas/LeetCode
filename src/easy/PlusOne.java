package easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
    }
    public static void plusOne(int[] digits){
        System.out.println(Arrays.toString(digits));
        digits = new int[digits.length+1];
        System.out.println(Arrays.toString(digits));
    }
}
