class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> preReqs = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            preReqs.put(i, new ArrayList());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            preReqs.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i = 0; i < numCourses; i++) {
            if (!dfs(i, preReqs, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Integer curr, HashMap<Integer, List<Integer>> preReqs, HashSet<Integer> visited) {
        if (visited.contains(curr)) {
            return false;
        }
        if (preReqs.get(curr).isEmpty()) {
            return true;
        }

        visited.add(curr);

        for (Integer pre: preReqs.get(curr)) {
            if (!dfs(pre, preReqs, visited)) {
                return false;
            }
        }
        visited.remove(curr);
        preReqs.put(curr, new ArrayList());
        return true;
    }
}
