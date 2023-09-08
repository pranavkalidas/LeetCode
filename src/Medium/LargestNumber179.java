package Medium;

import java.util.Arrays;

public class LargestNumber179 {
    public static void main(String[] args) {
        //int[] arr = {3,30,34,5,9};
        int[] arr = {0};
        //System.out.println(largestNumber(arr));
        System.out.println(largestNumberComparator(arr));
    }

    private static String largestNumber(int[] nums) {
        String ans = "";
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                String a = ""+ nums[i] + nums[j];
                String b = ""+ nums[j] + nums[i];
                if(a.compareTo(b)<0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            ans = ans + nums[i];
        }
        if(ans.charAt(0)=='0'){
            return "0";
        }
        return ans;
    }

    private static String largestNumberComparator(int[] nums){
        //String ans = "";
        String[] numStrings = Arrays.stream(nums).mapToObj(Integer::toString).toArray(String[]::new);
        Arrays.sort(numStrings, (a,b) -> (b+a).compareTo(a+b));
        return numStrings[0].equals("0")?"0":String.join("", numStrings);
    }

}
