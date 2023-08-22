package easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbingStairs(n));
    }

    public static int climbingStairs(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i<n ;i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
