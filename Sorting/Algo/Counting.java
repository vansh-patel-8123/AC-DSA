package Sorting.Algo;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting(arr);
    }
    public static void counting(int[] arr) {
        // finding max number for creating new Array
        int largest = Integer.MIN_VALUE;
        for (int each : arr) {
            largest = Math.max(each, largest);
        }

        // creating new Array and adding count of each element
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i <count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
