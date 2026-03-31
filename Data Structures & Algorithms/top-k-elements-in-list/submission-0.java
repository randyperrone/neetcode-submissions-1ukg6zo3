class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> elementsMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> elementsPriority = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Integer num: nums) {
            if (elementsMap.containsKey(num)) {
                int count = elementsMap.get(num);
                count++;
                elementsMap.put(num, count);
            } else {
                elementsMap.put(num, 1);
            }
        }
        elementsPriority.addAll(elementsMap.entrySet());

        int[] topK = new int[k];
        for(int i = 0; i < k; i++) {
            topK[i] = elementsPriority.poll().getKey();
        }
        return topK;
    }
}
