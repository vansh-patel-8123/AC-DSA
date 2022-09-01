package Array.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // creating Array
        int [] arr = new int[5];
        // declare   creating array

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;

        System.out.println(Arrays.toString(arr));

        arr[2] = 1;
        System.out.println(Arrays.toString(arr));
    }
}
