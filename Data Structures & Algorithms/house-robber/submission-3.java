class Solution {
    public int rob(int[] nums) {
        int evenTotal = 0;
        int oddTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenTotal = Math.max(evenTotal + nums[i], oddTotal);
                System.out.println("eventotal: " + evenTotal);
            } else {
                oddTotal = Math.max(oddTotal + nums[i], evenTotal);
                System.out.println("oddTotal: " + oddTotal);
            }
        }
        return (evenTotal < oddTotal) ? oddTotal : evenTotal;
    }
}