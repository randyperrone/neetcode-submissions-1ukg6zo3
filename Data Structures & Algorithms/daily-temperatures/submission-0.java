class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<int[]> tempIndexStack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            int curr = temperatures[i];
            while (!tempIndexStack.isEmpty() && curr > tempIndexStack.peek()[0]) {
                int[] temp = tempIndexStack.pop();
                result[temp[1]] = i - temp[1];
            }
            tempIndexStack.push(new int[]{curr, i});
        }
        return result;
    }
}
