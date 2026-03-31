class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minNumber = k;
        int leftIndex = 0;
        int leftValue = blocks.charAt(0);
        int wBlocks = 0;
        boolean rIsAtTFlag = false;
        for(int i = 0; i < blocks.length(); i++) {
            if (!rIsAtTFlag && (i == (k-1))) {
                rIsAtTFlag = true;
                if (blocks.charAt(i) == 'W') {
                    wBlocks++;
                }
                minNumber = wBlocks;
                continue;
            } 
            if (rIsAtTFlag) {
                if (leftValue == 'W') {
                    wBlocks--;
                }
                leftIndex++;
                leftValue = blocks.charAt(leftIndex);
                if (blocks.charAt(i) == 'W') {
                    wBlocks++;
                }
                if (wBlocks < minNumber) {
                    minNumber = wBlocks;
                }
            } else if (blocks.charAt(i) == 'W') {
                wBlocks++;
            }
        }
        return minNumber;
    }
}