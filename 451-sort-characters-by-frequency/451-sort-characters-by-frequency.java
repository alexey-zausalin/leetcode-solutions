class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue(Map.Entry.comparingByValue().reversed());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for (int i = entry.getValue(); i > 0; i--) {
                sb.append(entry.getKey());
            }
        }
        
        return sb.toString();
    }
}