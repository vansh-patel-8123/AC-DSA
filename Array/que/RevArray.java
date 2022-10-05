package Array.que;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // de-allocation of pointer
            start++;
            end--;
        }
    }
}
