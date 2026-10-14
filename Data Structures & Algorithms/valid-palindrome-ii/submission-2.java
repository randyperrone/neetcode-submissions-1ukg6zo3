class Solution {
    public boolean validPalindrome(String s) {
        boolean skipUsed = false;
        int length = s.length() - 1;
        int t = 0;
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - t)) {
                if (skipUsed) {
                    return false;
                }
                skipUsed = true;
                if(isPalindrome(s, i + 1, t)) {
                    return true;
                } else if (isPalindrome(s, i, t + 1)) {
                    return true;
                } else {
                    return false;
                }
            }
            t++;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int t) {
        for (int j = i; j < s.length() - t; j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1 - t)) {
                return false;
            }
            t++;
        }
        return true;
    }
}