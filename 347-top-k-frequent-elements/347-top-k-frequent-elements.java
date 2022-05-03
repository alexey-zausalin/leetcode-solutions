class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(map.size(), (a, b) -> - map.get(a).compareTo(map.get(b)));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
        }

        int[] ans = new int[k];
        while (k > 0) {
            ans[--k] = pq.poll();
        }

        return ans;
    }
}