class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        int max = sum;
        
        int l = 0;
        int h = k-1;
        // int sum = 0;
        while(h < arr.length-1){
            sum -= arr[l];
            sum += arr[h+1];
            h++;
            l++;
            max= Math.max(sum, max);
        }
        return max;
        
    }
}