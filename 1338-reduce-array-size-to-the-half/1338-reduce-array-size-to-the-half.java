class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry.getValue());
        }

        int setCount = 0, sum = arr.length / 2;
        while (sum > 0) {
            sum -= pq.poll();
            setCount++;
        }

        return setCount;
    }
}