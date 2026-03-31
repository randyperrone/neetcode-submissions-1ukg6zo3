class Solution {
    public int[] countBits(int n) {
        int[] counts = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int bit = i;
            while(bit > 0) {
                System.out.println(bit);
                if ((bit & 1) == 1) {
                    count++;
                }
                bit = bit >> 1;
            }
            counts[i] = count;
        }
        return counts;
    }
}
