class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int maxCount = 1;
        for(int num: nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                    if (length > maxCount) {
                        maxCount = length;
                    }
                }
            }
        }
        return maxCount;
    }
}
