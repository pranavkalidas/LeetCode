package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLenghtOfPairChain {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4}};

        System.out.println(findLongestChain(arr));
    }

    private static int findLongestChain(int[][] pairs) {
        int count = 1;
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        System.out.println(Arrays.deepToString(pairs));
        int b = pairs[0][1];
        for(int i =1; i<pairs.length; i++){
            if(pairs[i][0]>b){
                count++;
                b = pairs[i][1];
            }
        }
        return count;
    }
}
