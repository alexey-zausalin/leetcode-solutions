class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (Integer stone: stones) {
            stonesQueue.add(stone);
        }

        while(stonesQueue.size() >= 2) {
            int newWeight = stonesQueue.remove() - stonesQueue.remove();
            if (newWeight > 0) {
                stonesQueue.add(newWeight);
            }
        }

        return stonesQueue.isEmpty() ? 0 : stonesQueue.poll();
    }
}