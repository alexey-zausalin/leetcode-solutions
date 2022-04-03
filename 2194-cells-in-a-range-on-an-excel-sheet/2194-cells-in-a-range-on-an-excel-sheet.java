class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList();

        char fromCol = s.charAt(0), toCol = s.charAt(3);
        char fromRow = s.charAt(1), toRow = s.charAt(4);
        for(char col = fromCol; col <= toCol; col++) {
            for (char row = fromRow; row <= toRow; row++) {
                result.add(col + "" + row);
            }
        }
        
        return result;
    }
}