class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        TreeSet<Integer> minHeap = new TreeSet<>();
        for(int num: nums) {
            minHeap.add(num);
        }

        int maxCount = 1;
        Integer previous = minHeap.pollFirst();
        int count = 1;
        while(!minHeap.isEmpty()) {
            Integer current = minHeap.pollFirst();
            if (previous.equals(current)) {
                continue;
            } else if (current.equals(previous + 1)) {
                count++;
                previous = current;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                previous = current;
                count = 1;
            }
        }

        return maxCount;
    }
}
