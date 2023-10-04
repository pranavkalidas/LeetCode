package TopInterview150;

//167
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                break;
            }
            if(sum < target){
                i++;
            }
            if(sum > target){
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}
