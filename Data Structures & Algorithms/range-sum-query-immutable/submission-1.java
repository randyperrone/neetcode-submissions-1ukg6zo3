class NumArray {

    private int[] prefixNums;
    public NumArray(int[] nums) {
        prefixNums = nums;
        for (int i = 1; i < prefixNums.length; i++) {
            prefixNums[i] = prefixNums[i-1] + prefixNums[i];
        }

    }
    
    public int sumRange(int left, int right) {
        int prefixLeft = (left == 0) ? 0 : prefixNums[left - 1];
        return prefixNums[right] - prefixLeft;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */