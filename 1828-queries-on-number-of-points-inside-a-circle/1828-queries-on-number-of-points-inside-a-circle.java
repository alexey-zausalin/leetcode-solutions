class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int pointsInside = 0;
            for (int[] point: points) {
                if (insideCircle(point, queries[i])) {
                    pointsInside++;
                }
            }
            answer[i] = pointsInside;
        }

        return answer;
    }
    
    private boolean insideCircle(int[] point, int[] query) {
        // (x - center_x)² + (y - center_y)² < radius²
        return Math.pow((double)(point[0] - query[0]), 2) + Math.pow((double)(point[1] - query[1]), 2) <= Math.pow((double)(query[2]), 2);
    }
}