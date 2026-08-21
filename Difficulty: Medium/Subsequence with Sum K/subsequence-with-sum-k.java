class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        return subset(arr, 0, k, 0);
    }

    public static boolean subset(int[] arr, int i, int k, int sum) {

        if (sum == k) {
            return true;
        }

        if (i == arr.length || sum > k) {
            return false;
        }

        // Take
        if (subset(arr, i + 1, k, sum + arr[i])) {
            return true;
        }

        // Don't take
        return subset(arr, i + 1, k, sum);
    }
}