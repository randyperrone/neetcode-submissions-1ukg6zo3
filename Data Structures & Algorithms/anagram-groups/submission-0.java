class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> visited = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (visited.containsKey(sorted)) {
                visited.get(sorted).add(strs[i]);
            } else {
                visited.computeIfAbsent(sorted, x -> new ArrayList<>()).add(strs[i]);
            }
        }
        List<List<String>> returnList = new ArrayList<>();
        for(String key: visited.keySet()) {
            returnList.add(visited.get(key));
        } 
        return returnList;
    }
}
