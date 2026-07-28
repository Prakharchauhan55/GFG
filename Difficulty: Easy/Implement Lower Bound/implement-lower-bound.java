class Solution {
    int lowerBound(int[] arr,int target){
    int l = 0;
    int h = arr.length-1;
    int ans = arr.length;
    while(l <= h){
        int mid = (l+h)/2;
        if(arr[mid] < target){
            l = mid+1;
        }
        else{
            h = mid-1;
            ans = mid;
        }
    }
    return ans;
 }
}
