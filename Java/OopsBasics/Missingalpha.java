class Missingalpha {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        // Convert the input string to lowercase
        input = input.toLowerCase();

        // Create a boolean array to track the presence of alphabets
        boolean[] alphabetPresent = new boolean[26];

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet
            if (Character.isAlphabetic(c)) {
                // Set the corresponding index to true in the alphabetPresent array
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Print the missing alphabets
        System.out.print("Missing alphabets: ");
        for (int i = 0; i < alphabetPresent.length; i++) {
            if (!alphabetPresent[i]) {
                // Convert the index to the corresponding character
                char missingAlphabet = (char) (i + 'a');
                System.out.print(missingAlphabet + " ");
            }
        }
    }
}