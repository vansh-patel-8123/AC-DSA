package Sorting.Algo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        Algo(arr);
        AlgoOpti(arr);
    }
    public static void Algo(int[] arr){
        // looping all 5 main turns 
        for(int i=0; i<arr.length; i++){
 
            // changing index from 0 to x   -> x = arr.length - i -> means always in i terms last i terms are sorted
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Best Case -> O(n)
    public static void AlgoOpti(int[] arr) {
        // looping all 5 main turns 
        for(int i=0; i<arr.length; i++){

            int swapCount = 0;
            // changing index from 0 to x
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
