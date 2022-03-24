class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char buffer;
        while (left < right) {
            buffer = s[left];
            s[left] = s[right];
            s[right] = buffer;
            
            left++;
            right--;
        }
    }
}