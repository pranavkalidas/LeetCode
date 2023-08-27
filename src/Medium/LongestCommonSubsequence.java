package Medium;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

    private static int longestCommonSubsequence(String text1, String text2) {
        int[][] memo = new int[text1.length()+1][text2.length()+1];
        int ans1 = recursiveHelper(text1,text2,0,0,memo);
        int ans2 = dynamicHelper(text1,text2);
        return ans2;
    }

    private static int dynamicHelper(String text1, String text2) {
        int[][] memo = new int[text1.length()+1][text2.length()+1];
        for(int i = 1; i<=text1.length();i++){
            for(int j = 1; j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    memo[i][j] = 1 + memo[i-1][j-1];
                }
                else{
                    memo[i][j] = Math.max(memo[i][j-1],memo[i-1][j]);
                }
            }
        }
        return memo[text1.length()][text2.length()];
    }

    private static int recursiveHelper(String text1, String text2, int i, int j, int[][] memo) {
        if(memo[i][j]!=0){
            return memo[i][j];
        }
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(text1.charAt(i) == text2.charAt(j)){
            memo[i][j] = 1 + recursiveHelper(text1,text2,i+1,j+1,memo);
            return memo[i][j];
        }
        return Math.max(recursiveHelper(text1,text2,i+1,j,memo),recursiveHelper(text1,text2,i,j+1,memo));
    }
}
