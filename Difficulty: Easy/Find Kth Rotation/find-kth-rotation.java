class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int l = 0;
        int h = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(l < h){
            int mid = (l+h)/2;
            if(arr[mid] > arr[h]){
                l = mid + 1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }
}