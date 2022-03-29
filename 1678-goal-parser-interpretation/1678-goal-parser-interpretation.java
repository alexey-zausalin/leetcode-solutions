class Solution {
    public String interpret(String command) {
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