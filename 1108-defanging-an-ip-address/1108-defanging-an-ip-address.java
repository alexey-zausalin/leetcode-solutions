class Solution {
    final private static String SPLIT_REGEX = "\\.";
    final private static String CHUNK_COMBINER = "[.]";

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (String chunk: address.split(SPLIT_REGEX, 4)) {
            if (!sb.isEmpty()) {
                sb.append(CHUNK_COMBINER);
            }
            sb.append(chunk);
        }

        return sb.toString();
    }
}