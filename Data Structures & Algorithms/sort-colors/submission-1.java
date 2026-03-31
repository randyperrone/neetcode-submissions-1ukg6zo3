class Solution {
    public void sortColors(int[] nums) {
        int[] buckets = new int[3];
        for(int num: nums) {
            buckets[num]++;
        }

        int bucketIndex = 0;
        int numIndex = 0;
        for(int num: nums) {
            while (buckets[bucketIndex] == 0){
                bucketIndex++;
            } 
            nums[numIndex] = bucketIndex;
            numIndex++;
            buckets[bucketIndex]--;
            
        }
        
    }
}