class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalLength += nums[i];
        }

        int[] decompressedList = new int[totalLength];
        int pointer = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int value = nums[i+1];
            for (int j = 0; j < freq; j++) {
                decompressedList[pointer++] = value;
            }
        }
        
        return decompressedList;
    }
}