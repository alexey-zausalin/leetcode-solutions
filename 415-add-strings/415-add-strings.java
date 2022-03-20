class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int shift = 0;
        int value;

        int maxLength = Math.max(num1.length(), num2.length());
        for (int i = 1; i <= maxLength || shift != 0; i++) {
            value = shift + getValue(num1, i) + getValue(num2, i);

            shift = value / 10;
            sb.append(value % 10);
        }

        return sb.reverse().toString();
    }

    private int getValue(String s, int index) {
        index = s.length() - index;
        return (index >= 0) ? Character.getNumericValue(s.charAt(index)) : 0;
    }
}