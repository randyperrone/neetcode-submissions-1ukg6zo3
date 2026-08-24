class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(true) {
            Integer result = 0;
            while (n > 0) {
                Integer endVal = n % 10;
                result += endVal * endVal;
                n = n / 10;
            }
            if (result == 1) {
                return true;
            }
            if (seen.contains(result)) {
                return false;
            } else {
                seen.add(result);
                n = result;
            }
        }
    }
}
