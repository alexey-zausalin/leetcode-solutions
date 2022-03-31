class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = (nums1.length < nums2.length)
            ? innerIntersect(nums1, nums2)
            : innerIntersect(nums2, nums1);
        
        int[] intersect = new int[list.size()];
        int key = 0;
        for (Integer num: list) {
            intersect[key++] = num;
        }
        
        return intersect;
    }
    
    private List<Integer> innerIntersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int start = 0;
        for (int i = 0; i < nums1.length; i++) {
            int lo = start, hi = nums2.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums2[mid] == nums1[i]) {
                    while (mid > start && nums2[mid-1] == nums1[i]) {
                        mid--;
                    }
                    list.add(nums1[i]);
                    start = mid + 1;
                    break;
                }
                
                if (nums2[mid] < nums1[i]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
                
            }
        }
        
        return list;
    }
}