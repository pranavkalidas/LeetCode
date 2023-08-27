package easy;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 1023;
        System.out.println(fact(n));
    }

    private static BigInteger fact(int n) {
        BigInteger num = new BigInteger("1");
        for(int i=2; i<=n; i++){
            num = num.multiply(new BigInteger(String.valueOf(i)));
        }
        return num;
    }
}
