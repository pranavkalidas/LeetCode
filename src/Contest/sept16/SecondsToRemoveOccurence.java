package Contest.sept16;

public class SecondsToRemoveOccurence {
    public static void main(String[] args) {
        String s ="001011";
        System.out.println(secondsToRemoveOccurrences(s));
    }

    public static int secondsToRemoveOccurrences(String s) {
        int count=0;
        while(s.contains("01")){
            s = s.replace("01","10");
            count++;
        }
        return count;
    }
}
