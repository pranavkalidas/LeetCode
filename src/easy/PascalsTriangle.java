package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 8;
        List<List<Integer>> list = generate(numRows);

        System.out.println(list);
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1){
            return list;
        }

        list.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==2){
            return list;
        }

        for(int i=2; i<numRows; ++i){
            ArrayList<Integer> subList = new ArrayList<>();
            for(int j=0; j<=i; ++j){
                if(i==j || j==0){
                    subList.add(1);
                    continue;
                }
                int sum = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                subList.add(sum);
            }
            list.add(subList);
        }

        return list;
    }

    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
            l1 = rowGen(i);
            result.add(l1);
        }
        return result;
    }
    public static List<Integer> rowGen(int r) {
        List<Integer> rowList = new ArrayList<>();
        int ans = 1;
        rowList.add(1);
        for(int i=1;i<r;i++) {
            ans = ans*(r-i);
            ans = ans/i;
            rowList.add(ans);
        }
        return rowList;
    }
}
