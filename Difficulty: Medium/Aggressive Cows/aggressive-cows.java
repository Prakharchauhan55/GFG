class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int l = 1;
        int h = arr[arr.length -1]- arr[0];
        while(l <= h){
            int mid = (l+h)/2;
            if(possible(arr, mid, k)){
                
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return h;
    }
    
    public boolean possible(int arr[], int pos, int k) {
        int cow = 1;
        int laststall = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int dist = arr[i] - laststall;
            if (dist >= pos) {
                cow++;
                laststall = arr[i];
            }
            if (cow >= k) {
                return true;
            }
        }
        return false;
    }
}