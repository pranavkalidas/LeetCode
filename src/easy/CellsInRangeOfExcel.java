package easy;

import java.util.ArrayList;
import java.util.List;

public class CellsInRangeOfExcel {
    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println(cellsInRange(s));
    }

    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        for(int i = s.charAt(0); i<=s.charAt(3); i++){
            for(int j=s.charAt(1)-48; j<=(s.charAt(4)-48); j++){
                list.add("" + (char)i + j);
            }
        }
        return list;
    }

}
