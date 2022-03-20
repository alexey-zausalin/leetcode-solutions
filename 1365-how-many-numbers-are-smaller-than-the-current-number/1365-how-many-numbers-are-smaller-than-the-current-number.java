public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();

        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = findSmallestNumbers(sortedNums, nums[i]);
        }

        return result;
    }

    private int findSmallestNumbers(int[] sortedNums, int num) {
        int l = 0;
        int r = sortedNums.length;
        int pivot;

        while (l <= r) {
            pivot = l + (r - l) / 2;

            if (sortedNums[pivot] == num) {
                while (pivot > 0 && sortedNums[pivot-1] == num) {
                    pivot--;
                }
                return pivot;
            }

            if (sortedNums[pivot] < num) {
                l = pivot + 1;
            } else {
                r = pivot - 1;
            }
        }

        return 0;
    }
}