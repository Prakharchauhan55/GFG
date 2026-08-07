class Solution {
    public int findPages(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        while(max <= sum){
            long mid = (sum+max)/2;
            if(result(arr,mid,k)){
                sum = mid-1;
            }
            else{
                max = mid+1;
            }
        }
        return (int)max;
    }
    
    public static boolean result(int[] arr, long pages, int k){
        int student = 1;
        long no_of_pages = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] + no_of_pages <= pages){
                no_of_pages += arr[i];
            }
            else{
                student++;
                no_of_pages = arr[i];
            }
        }
        if(student <= k){
            return true;
        }
        else{
            return false;
        }
    }
}