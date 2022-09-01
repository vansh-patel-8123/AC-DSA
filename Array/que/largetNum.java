package Array.que;

import java.util.Arrays;

public class largetNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,647,467,65,56,2,34,4};
        System.out.println(Arrays.toString(max(arr)));
    }
    public static int[] max(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return new int[] {max,min};
    }
}
