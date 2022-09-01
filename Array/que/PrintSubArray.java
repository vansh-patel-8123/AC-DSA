package Array.que;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        subArray(arr);
        sumOfSubArray(arr);
        maxAndMinSubarray(arr);
    }
    public static void subArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                // print
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
    public static void sumOfSubArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                // sum
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                System.out.println(sum);
            }
        }
    }
    public static void maxAndMinSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
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
                if(sum < min){
                    min = sum;
                }
            }
        }
        System.out.println("MAX ->" + max);
        System.out.println("MIN -> " + min);
    }
}
