class Solution {
    public int minTime(int[] arr, int k) {
        int l = min(arr);
        int h = sum(arr);
        while(l <= h){
            int mid = (l+h)/2;
            if(result(arr, mid, k)){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    public static boolean result(int[] arr, int mid, int k){
        int sum = 0;
        int painter = 1;
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] <= mid){
                sum += arr[i];
            }
            else{
                painter++;
                sum = arr[i];
            }
        }
        if(painter <= k){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int min(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}

