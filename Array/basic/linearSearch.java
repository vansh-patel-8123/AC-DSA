package Array.basic;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {13,654,674,857,876,689,456,877,33};
        int target = 33;
        System.out.println(LS(arr,target));
        System.out.println(arr[LS(arr,target)]);
    }
    public static int LS(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
