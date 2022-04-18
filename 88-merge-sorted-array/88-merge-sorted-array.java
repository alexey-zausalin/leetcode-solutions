class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = Arrays.copyOf(nums1, nums1.length);

        int l = 0, j = 0;
        for (int k = 0; k < aux.length; k++) {
            if (l >= m)                 nums1[k] = nums2[j++];
            else if (j >= n)            nums1[k] = aux[l++];
            else if (aux[l] > nums2[j]) nums1[k] = nums2[j++];
            else                        nums1[k] = aux[l++];
        }
    }
}