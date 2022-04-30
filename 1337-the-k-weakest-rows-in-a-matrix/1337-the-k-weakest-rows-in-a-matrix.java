class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(
            mat.length,
            new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    int ans = o1.getValue().compareTo(o2.getValue());
                    if (ans == 0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    
                    return ans;
                }
            }
        );

        for (int i = 0; i < mat.length; i++) {
            int strength = 0;
            for (int j = 0; j < mat[i].length; j++) {
                strength += mat[i][j];
            }

            pq.add(Map.entry(i, strength));
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
}