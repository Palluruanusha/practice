class CharacterCounter {
    public static int countOccurrences(String inputString, char targetCharacter) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetCharacter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "engineering";
        char ch = 'e';
        int occurrences = countOccurrences(s, ch);
        System.out.println("Count'" + ch + "' appears " + occurrences + " times in the string.");
    }
}
