class Solution {
    int countFreq(int[] arr, int target) {
        int firstIndex = first(arr, target);

        if (firstIndex == -1) {
            return 0;
        }

        int lastIndex = last(arr, target);

        return lastIndex - firstIndex + 1;
    }

    public int first(int[] nums, int target) {
        int l = 0, h = nums.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;
                }
                h = mid - 1;
            }
        }
        return -1;
    }

    public int last(int[] nums, int target) {
        int l = 0, h = nums.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                }
                l = mid + 1;
            }
        }
        return -1;
    }
}