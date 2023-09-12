package easy;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }

    public static String truncateSentence(String s, int k) {
        int i = 0;
        int count = 0;
        while(count!=k){
            i = s.indexOf(" ",i+1);
            count++;
        }
        if(i==-1){
            return s;
        }
        return s.substring(0,i);
    }

}
