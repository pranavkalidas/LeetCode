package easy;

public class ExcelSheetToTitle {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(convertToTitle(n));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber-- >0){
            s.append((char) (columnNumber%26 + 'A'));
            columnNumber /= 26;
        }
        return s.reverse().toString();
    }
}
