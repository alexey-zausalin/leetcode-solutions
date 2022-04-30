class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue(Map.Entry.comparingByValue().reversed());
        for (Map.Entry entry : map.entrySet()) {
            pq.add(entry);
        }

        int setCount = 0, sum = arr.length / 2;
        while (sum > 0) {
            sum -= pq.poll().getValue();
            setCount++;
        }

        return setCount;
    }
}