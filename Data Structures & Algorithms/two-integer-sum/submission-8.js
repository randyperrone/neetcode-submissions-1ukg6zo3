class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const hashmap = new Map();
        nums.forEach((num, index) => {
            hashmap.set(num, index);
        });

        let index = 0;
        for (let num of nums) {
            const temp = target - num;
            if (hashmap.has(temp) && hashmap.get(temp) != index) {
                return Array.of(index, hashmap.get(temp));
            }
            index++;
        }
    }
}
