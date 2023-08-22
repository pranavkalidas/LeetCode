package easy;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(arr, arr.length));
    }

    public static int minCostClimbingStairs(int[] arr,int n){
        if(n<0){
            return 0;
        }
        if(n==0 || n==1)
            return arr[n];
        //return Math.min(minCostClimbingStairs(arr,n-1)+minCostClimbingStairs(arr,n-2));
        return 0;
    }
}
