class Solution {
    public boolean validTree(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList());
        }
        for (int i = 0; i < edges.length; i++) {
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        return dfs(0, -1, map, visited) && visited.size() == n;
    }

    private boolean dfs(Integer curr, Integer parent, HashMap<Integer, List<Integer>> map, HashSet<Integer> visited) {
        if (visited.contains(curr)) {
            return false;
        }
        visited.add(curr);
        List<Integer> values = map.get(curr);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals(parent)) continue;
            if (!dfs(values.get(i), curr, map, visited)) {
                return false;
            }
        }
        return true;
    }
}