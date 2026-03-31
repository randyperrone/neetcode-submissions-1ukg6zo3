class Solution {
    public int removeElement(int[] nums, int val) {
        Set<Integer> elementPositions = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                elementPositions.add(i);
            }
        }
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if (!elementPositions.contains(i)) {
                nums[index++] = nums[i];
            }
        }
        return nums.length - elementPositions.size();
    }
}