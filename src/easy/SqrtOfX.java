package easy;

public class SqrtOfX {

    /* Following method implements the Newton - Raphson method to find the square root */

    public static void main(String[] args) {
        int num = 17;
        System.out.println(mySqrt(num));
    }

    public static int mySqrt(int x) {
        double temp, squareRoot;

        squareRoot =  (double) x / 2;

        do {
            temp = squareRoot;
            squareRoot = (temp + (x / temp))/2;
        } while((temp - squareRoot) != 0);
        return (int)squareRoot;
    }
}
