class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        const arr = new Array(nums.length + nums.length);
        let count = 0;
        for (let i = 0; i < nums.length; i++) {
            arr[count] = nums[i];
            count++;
        }
        for (let i = 0; i < nums.length; i++) {
            arr[count] = nums[i];
            count++;
        }
        return arr;
    }
}
