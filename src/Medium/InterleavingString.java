package Medium;

public class InterleavingString {
    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1, s2, s3));
    }

    private static boolean isInterleave(String s1, String s2, String s3) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        return helperFunction(0, 0, s1, s2, s3, dp);
    }

    private static boolean helperFunction(int i, int j, String s1, String s2, String s3, int[][] dp) {
        //Both i and j have been fully traversed
        if(i==s1.length() && j==s2.length()){
            return true;
        }

        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            helperFunction(i+1,j,s1,s2,s3,dp);
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
            helperFunction(i,j+1,s1,s2,s3,dp);
        }
        if(s2.charAt(j)==s3.charAt(i+j) && s1.charAt(i)==s3.charAt(i+j)) {

        }
        return false;
    }
}
