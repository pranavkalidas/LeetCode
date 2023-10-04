package TopInterview150;

//13
public class RomanToInteger {

    public int romanToInt(String s) {
        int sum =0;
        int num,prev = 0;
        for(int i = s.length()-1; i>=0; i--) {
            num = getInteger(s.charAt(i));
            sum += (prev > num) ? -num : num;
            prev = num;
        }
        return sum;
    }

    private static int getInteger(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
