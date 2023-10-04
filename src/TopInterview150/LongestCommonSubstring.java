package TopInterview150;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String[] strs  = {"dogerman","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    /*
    Take first word
    Keep on reducing until u find a substring match
    If Found a match, the index will start with 0
    So take the next string and repeat
     */
}
