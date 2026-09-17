class MedianFinder {
    private List<Integer> nums;
    public MedianFinder() {
        nums = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if (nums.isEmpty()) {
            nums.add(num);
            return;
        }
        int index = Collections.binarySearch(nums,num);
        if (index < 0) {
            index = -(index + 1);
        }
        nums.add(index, num);
    }
    
    public double findMedian() {
        if (nums.size() % 2 == 1) {
            return (double) nums.get(nums.size() / 2);
        }
        if (nums.size() == 2) {
            int temp = nums.get(0) + nums.get(1);
            return temp / 2.0;
        }
        int first = nums.get(nums.size() / 2);
        int second = nums.get((nums.size() / 2) - 1);
        return (first + second) / 2.0;
    }
}
