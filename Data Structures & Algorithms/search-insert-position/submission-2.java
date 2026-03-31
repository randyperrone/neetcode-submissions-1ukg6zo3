class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        if (target < nums[left]) {
            return 0;
        }

        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                mid = left;
            } else {
                right = mid - 1;
            }
        }
        return mid;
    }
}