package TopInterview150;

//12
public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 1994;
        System.out.println(intToRoman(n));

    }
    public static String intToRoman(int num) {
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","XI"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands = {"","M","MM","MMM"};
        return thousands[num%10000/1000] + hundreds[num%1000/100] + tens[num%100/10] + ones[num%10];
    }

    /*
    1994 % 10000 = 1994     1993 / 1000 = 1

    1993 % 1000 = 993       993 / 100 = 9

    1993 % 100 = 93         93 / 10 = 9

    1993 % 10 = 3           3 / 1 = 3
     */

}
