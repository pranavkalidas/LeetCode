package TopInterview150;

//392
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int len1 = t.length(), len2 = s.length();
        while(j < len1 && i < len2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == len2;
    }
}
