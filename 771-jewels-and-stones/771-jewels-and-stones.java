class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsInStones = new HashSet<>();
        for (char jewel: jewels.toCharArray()) {
            jewelsInStones.add(jewel);
        }

        int num = 0;
        for (char stone :
                stones.toCharArray()) {
            if (jewelsInStones.contains(stone)) {
                num++;
            }

        }

        return num;
    }
}