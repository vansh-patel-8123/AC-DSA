package Sorting.Algo;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        InsertionSort(arr);
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = i;
            int previous = i - 1;

            while(previous >= 0 && arr[previous] > arr[current]){
                int key = arr[current];
                arr[current] = arr[previous];
                arr[previous] = key;
                previous--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
