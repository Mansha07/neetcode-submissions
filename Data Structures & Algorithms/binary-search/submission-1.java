class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int low = 0;
        int high = nums.length - 1;
        mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target > nums[high] || target < nums[low]) {
            return -1;
        }
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid+1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
