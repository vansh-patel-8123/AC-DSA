package Array.que;

public class PairsInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // display pairs
        pair(arr);
        // number of pairs
        int n = arr.length;
        System.out.println("number of pairs = "+n*(n-1)/2);
    }
    public static void pair(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")\t");
            }
            System.out.println();
        }
    }
}
