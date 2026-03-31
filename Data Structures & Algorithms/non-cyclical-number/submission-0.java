class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            Integer result = 0;
            while (n > 0) {
                Integer temp = n % 10;
                result += (temp * temp);
                n = n / 10;
            }
            if (result == 1) {
                return true;
            }
            if (set.contains(result)) {
                return false;
            } else {
                set.add(result);
                n = result;
            }
        }
    }
}
