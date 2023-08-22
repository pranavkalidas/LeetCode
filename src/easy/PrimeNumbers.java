package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumbers {

    /* Solved using Sieve of Eratostenes*/

    public static void main(String[] args) {
        int upperBound = 100;
        Arrays.stream(findPrimes(upperBound)).forEach(System.out::println);
    }

    public static int[] findPrimes(int upperBound){
        int[] isComposite = new int[upperBound+1];
        for(int i = 2; i*i <= upperBound; i++){
            if(isComposite[i]!=1) {
                for(int j = i*i; j<=upperBound; j+=i){
                    isComposite[j]=1;
                }
            }
        }
       return IntStream.range(0,upperBound).filter(i-> isComposite[i]==0).toArray();
    }
}
