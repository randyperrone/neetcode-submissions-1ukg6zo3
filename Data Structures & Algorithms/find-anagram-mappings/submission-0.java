class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            valToIndex.put(nums2[i], i);
        }
        
        int i = 0;
        for(int num: nums1) {
            nums2[i] = valToIndex.get(num);
            i++;
        }
        return nums2;
    }
}
