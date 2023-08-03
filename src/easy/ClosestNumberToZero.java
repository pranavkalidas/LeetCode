package easy;

public class ClosestNumberToZero {
    public static void main(String[] args) {
        int[] arr = {-10,6,-1,1,10,9}; //Declare array
        int index = 0;
        int closest = Integer.MAX_VALUE;
        int i = 0;
        while(i<arr.length) {
            int a = Math.abs(arr[i]);
            if(a < closest) {
                closest = a;
                index = i;
            }
            if(a == closest) {
                if(arr[i]>arr[index]) {
                    index = i;
                }
            }
            i++;
        }
        System.out.println(arr[index]);
    }
}
