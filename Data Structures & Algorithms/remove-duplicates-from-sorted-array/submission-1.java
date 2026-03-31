
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> duplicatePositions = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                duplicatePositions.add(i+1);
            }
        }
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if (!duplicatePositions.contains(i)) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}