class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        HashSet<Character> visited = new HashSet<>();
        int L = 0;
        visited.add(s.charAt(L));
        int longest = 1;
        for (int R = 1; R < s.length(); R++) {
            while (visited.contains(s.charAt(R))) {
                visited.remove(s.charAt(L));
                L++;   
            }
            visited.add(s.charAt(R));
            if ((R - L + 1) > longest) {
                longest = R - L + 1;
            }
        }
        return longest;
    }
}
