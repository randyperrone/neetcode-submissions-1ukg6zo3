class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
        if (t.isEmpty()) return true;
        int length = t.length()-1;
        for (int i = 0; i <= (length / 2); i++) {
            if (t.charAt(i) != t.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }
}