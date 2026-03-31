class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                Integer value = map.get(c);
                if (value == 1) {
                    map.remove(c);
                } else {
                    map.put(c, --value);
                }
            } else {
                return false;
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
}
