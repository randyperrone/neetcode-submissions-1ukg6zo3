class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == ' ')
                return 0;
            else
                return 1;
        }
        int count = 0;
        boolean startCounting = false;
        for(int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                startCounting = true;
                count++;
            }
            
            if (s.charAt(i) == ' ') {
                if (startCounting) {
                    return count;
                }
            }
        }
        return 0;
    }
}