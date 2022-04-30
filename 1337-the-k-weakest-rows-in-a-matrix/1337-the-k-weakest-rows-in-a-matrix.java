class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
            mat.length,
            new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    int ans = a[0] - b[0];
                    if (ans == 0) {
                        return a[1] - b[1];
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

            pq.add(new int[]{strength, i});
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[1];
        }

        return ans;
    }
}