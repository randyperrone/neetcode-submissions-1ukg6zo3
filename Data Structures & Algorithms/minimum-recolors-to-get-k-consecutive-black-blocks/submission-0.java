class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minNumber = 100;
        int length = 0;
        if (blocks.length() == k) {
            length = 1;
        } else {
            length = (blocks.length() - k);
        }
        for (int i = 0; i < length; i++) {
            int wCount = 0;
            for (int j = i; j < (i+k); j++) {
                if (blocks.charAt(j) == 'W')
                    wCount++;
            }
            if (wCount < minNumber) {
                minNumber = wCount;
            }
        }
        return minNumber;
    }
}