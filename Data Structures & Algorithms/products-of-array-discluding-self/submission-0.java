class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int zeroCount = 0;
        int total = 1;
        for(int num: nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                total *= num;
            }
        }
        System.out.println(total);
        if (zeroCount > 1) {
            return products;
        }
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    products[i] = total;
                    return products;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            
            products[i] = total / nums[i];
            System.out.println(products[i]);
        }
        return products;
    }
}  
