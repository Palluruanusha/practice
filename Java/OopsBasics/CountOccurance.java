public class CharacterCounter {
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
        String string = "developer";
        char character = 'e';
        int occurrences = countOccurrences(string, character);
        System.out.println("The character '" + character + "' appears " + occurrences + " times in the string.");
    }
}
