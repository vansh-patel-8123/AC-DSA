package Array.Assignment;

import java.util.HashSet;

public class que1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(distinct(arr));   // O(n*n)
        System.out.println(optimise(arr));   // O(N)
    }
    public static boolean distinct(int[] arr){      // O(n*n)
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){      // O(N)
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimise(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
