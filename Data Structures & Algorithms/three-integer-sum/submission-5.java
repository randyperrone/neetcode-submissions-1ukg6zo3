class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    triplets.add(temp);
                    j++;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
            }
        }
        return triplets;
    }
}
