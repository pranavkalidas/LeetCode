public class MaxNumberInSentence2114 {
    public static void main(String[] args) {
        String[] strs = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

    }
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(String str : sentences){
            maxLength = Math.max(maxLength, str.split(" ").length);
        }
        return maxLength;
    }

    public int mostWordsFound2(String[] sentences) {
        int maxLength = 0;
        for(String str : sentences){
            int count = 0;
            int a = 0;
            while(a>=0){
                a = str.indexOf(" ",++a);
                count++;
            }
            maxLength = Math.max(maxLength,count);
        }
        return maxLength;
    }

}
