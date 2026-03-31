class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int total = 1;
        for(int num: nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                total *= num;
            }
        }
        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = total;
                } else {
                    nums[i] = 0;
                }
            }
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {     
            nums[i] = total / nums[i];
        }
        return nums;
    }
}  
