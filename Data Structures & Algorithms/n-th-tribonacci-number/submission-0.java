class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        return tribRec(n, cache);
    }

    public int tribRec(int n, HashMap<Integer, Integer> cache) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int tribVal = tribRec(n-1, cache) + tribRec(n-2, cache) + tribRec(n-3, cache);
        cache.put(n, tribVal);
        return tribVal;
    }
}