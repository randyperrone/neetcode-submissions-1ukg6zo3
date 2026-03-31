class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wBlocks = 0;

        for(int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                wBlocks++;
        }
        int minNumber = wBlocks;

        for(int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                wBlocks--;
            }
            if (blocks.charAt(i) == 'W') {
                wBlocks++;
            }
            minNumber = Math.min(wBlocks, minNumber);
        }
        return minNumber;
    }
}