class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = (nums1.length < nums2.length) ?
            innerIntersection(nums1, nums2) :
            innerIntersection(nums2, nums1);
            
        int key = 0;
        int[] intersection = new int[set.size()];
        for (int num: set) {
            intersection[key++] = num;
        }
        
        return intersection;
    }
    
    private Set<Integer> innerIntersection(int[] inNums, int[] toNums) {      
        Set<Integer> set = new HashSet();
        
        Arrays.sort(inNums);
        Arrays.sort(toNums);

        int start = 0;
        for (int i = 0; i < inNums.length; i++) {
            if (i < inNums.length - 1 && inNums[i] == inNums[i+1]) {
                continue;
            }
            
            int lo = start, hi = toNums.length - 1;
            while (lo <= hi) {
                int med = lo + (hi - lo) / 2;
                if (toNums[med] == inNums[i]) {
                    set.add(inNums[i]);
                    start = med;
                    break;
                }

                if (toNums[med] < inNums[i]) {
                    lo = med + 1;
                } else {
                    hi = med - 1;
                }
            }
        }

        return set;
    }
}