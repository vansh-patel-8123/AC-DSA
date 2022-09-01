package Array.que;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubarray(arr);
    }
    public static void maxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                // sum
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("MAX ->" + max);
    }
}
