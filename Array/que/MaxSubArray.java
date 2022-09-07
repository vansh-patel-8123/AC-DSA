package Array.que;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubarray(arr);
        prefixSum(arr);
        kadane(arr);
    }
    // bruteforce I    -> o(n3)
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


    // bruteforce II -> prefix sum  -> o(n2)
        // sum(start,end) = prefix[end] - prefix[start];
        // prefix is the sum of continuous sub array
    public static void prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        int currSum = Integer.MIN_VALUE;
        int Max = Integer.MIN_VALUE;

        // calculate prefix
        prefix[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j< arr.length; j++){
                int end = j;

                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start];

                if(Max < currSum){
                    Max = currSum;
                }
            }
        }
        System.out.println(Max);
    }

    // bruteforce III -> kadane's algo  -> o(n)
        // basic -> M+ve + m+ve = +ve
        //          M+ve + m-ve = +ve
        //          m+ve + M-ve = -ve -> bad
    public static void kadane(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = maxSum > currSum ? maxSum : currSum;
        }
        System.out.println(maxSum);
    }
}
