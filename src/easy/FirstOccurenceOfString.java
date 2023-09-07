package easy;

public class FirstOccurenceOfString {
    public static void main(String[] args) {
        String haystack = "sabutsa", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); ++i){
            int j=i, k=0;
            while(j<haystack.length() && k<needle.length()){
                if(haystack.charAt(j)!=needle.charAt(k))
                    break;
                j++;
                k++;
            }
            if(k==needle.length()) {
                return i;
            }
        }
        haystack.indexOf(needle);
        return -1;
    }

    public int strStrUsingSubStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();

        if (haylength < needlelength) return -1;

        if (haylength == needlelength) return haystack.equals(needle) ? 0 : -1;

        for (int i = 0; i < haylength - needlelength + 1; i++) {
            System.out.println(haystack.substring(i, i+needlelength));
            if (haystack.substring(i, i+needlelength).equals(needle)) return i;
        }

        return -1;
    }

}
