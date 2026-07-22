class Solution {
    int lowerBound(int[] arr,int target){
    int l=0,r=arr.length-1,ans=arr.length;
    while(l<=r){
        int m=l+(r-l)/2;
        if(arr[m]>=target){
            ans=m;
            r=m-1;
        }else{
            l=m+1;
        }
    }
    return ans;
}
}
