package Sorting.Algo;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SelectionSort(arr);
    }
    public static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            // finding minimum element in unsorted array
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            // swap minimum element with the i element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
