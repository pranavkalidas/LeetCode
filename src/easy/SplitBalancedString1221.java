package easy;

public class SplitBalancedString1221 {
    public int balancedStringSplit(String s) {
        int lCount=0, rCount=0, count=0;
        for(int i=0; i<s.length(); ++i){
            if(s.charAt(i)=='L')
                lCount++;
            else
                rCount++;
            if(lCount==rCount){
                count++;
                lCount=0; rCount=0;
            }
        }
        return count;

    }
}
