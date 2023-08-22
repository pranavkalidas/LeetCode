package easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};

        List<Integer> list = new ArrayList<Integer>();
        for (int[] ints : arr) {
            int luckyNum = Integer.MAX_VALUE;
            int j;
            boolean isLucky = true;
            int index = 0;
            for (j = 0; j < arr[0].length; ++j) {
                int a = ints[j];
                if (luckyNum > a) {
                    luckyNum = a;
                    index = j;
                }
            }
            for (int[] value : arr) {
                int b = value[index];
                if (luckyNum < b) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky)
                list.add(luckyNum);
        }
        System.out.println(list);
    }
}
