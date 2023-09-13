package TopInterview150;

import java.util.Arrays;

//189
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverseArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        reverseArray(arr, 0,k-1);
        System.out.println(Arrays.toString(arr));

        reverseArray(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    //Reverse full array
    //Reverse first half
    //Reverse Second half

}
