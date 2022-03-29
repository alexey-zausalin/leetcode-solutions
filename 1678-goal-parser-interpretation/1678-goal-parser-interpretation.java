class Solution {
    public String interpret(String command) {
        StringBuilder interpretedCommand = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    interpretedCommand.append("o");
                    i += 1;
                } else {
                    interpretedCommand.append("al");
                    i += 3;
                }
            } else {
                interpretedCommand.append("G");
            }
        }

        return interpretedCommand.toString();
    }
    
    // With two string builders
    public String interpretWithTwoStringBuilder(String command) {
        Map<String, String> alphabet = Map.of(
            "G", "G",
            "()", "o",
            "(al)", "al"
        );
        
        StringBuilder interpretedCommand = new StringBuilder();
        StringBuilder commandReplacement = new StringBuilder();
        for (char ch: command.toCharArray()) {
            commandReplacement.append(ch);
            
            String subSymbol = alphabet.getOrDefault(commandReplacement.toString(), null);
            if (subSymbol != null) {
                interpretedCommand.append(subSymbol);
                commandReplacement.setLength(0);
            }
        }

        return interpretedCommand.toString();
    }
}