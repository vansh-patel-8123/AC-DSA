package Array.que;

public class trappingWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(water(arr));
        // o(n)
    }
    public static int water(int[] arr){
        // calculate left boundary
            int[] left = new int[arr.length];
            left[0] = arr[0];
            for(int i=1; i<arr.length; i++){
                left[i] = Math.max(left[i-1],arr[i]);
            }
        // calculate right boundary
            int[] right = new int[arr.length];
            right[arr.length-1] = arr[arr.length-1];
            for(int i=arr.length-2; i>=0; i--){
                right[i] = Math.max(right[i+1],arr[i]);
            }


            int trappedWater = 0;
            for(int i=0; i<arr.length; i++){
                // waterLevel = min(left, right)
                int waterLevel = Math.min(left[i],right[i]);

                // water = waterLevel - height
                trappedWater += waterLevel - arr[i];
            }

            return trappedWater;
    }
}
