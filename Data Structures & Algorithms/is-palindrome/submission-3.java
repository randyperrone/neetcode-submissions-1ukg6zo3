class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != (t.charAt(t.length() - i - 1))) {
                return false;
            }
            if (i == (t.length() - 1 - i)){
                break;
            }
        }
        return true;
    }
}