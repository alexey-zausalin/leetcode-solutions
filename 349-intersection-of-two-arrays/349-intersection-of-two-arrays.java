class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = (nums1.length < nums2.length) ?
            getIntersection(nums1, nums2) :
            getIntersection(nums2, nums1);
            
        int key = 0;
        int[] intersection = new int[set.size()];
        for (int num: set) {
            intersection[key++] = num;
        }
        
        return intersection;
    }
    
    private Set<Integer> getIntersection(int[] inNums, int[] toNums) {
        Set<Integer> set = new HashSet();
        
        Arrays.sort(toNums);
        for (int inNum: inNums) {
            int lo = 0, hi = toNums.length - 1;
            while (lo <= hi) {
                int med = lo + (hi - lo) / 2;
                if (toNums[med] == inNum) {
                    set.add(inNum);
                    break;
                }

                if (toNums[med] < inNum) {
                    lo = med + 1;
                } else {
                    hi = med - 1;
                }
            }
        }

        return set;
    }
}