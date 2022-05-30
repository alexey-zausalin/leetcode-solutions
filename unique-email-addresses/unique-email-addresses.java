class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet();

        for (String email : emails) {

            String domain = "";
            int rightIndex = email.length() - 1;
            for (; rightIndex >= 0 ; rightIndex--) {
                if (email.charAt(rightIndex) == '@') {
                    domain = email.substring(rightIndex);
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rightIndex; i++) {
                char ch = email.charAt(i);

                if (ch == '.') {
                    continue;
                }

                if (ch == '+') {
                    break;
                }

                sb.append(ch);
            }

            sb.append(domain);

            uniqueEmails.add(sb.toString());
            sb.setLength(0);
        }

        return uniqueEmails.size();
    }
}