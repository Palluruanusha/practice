import java.util.ArrayList;
import java.util.List;

public class Palindromestring {
    public static void main(String[] args) {
        char[] characters = { 'r', 'a', 'c', 'e', 'c', 'a', 'r', 'd', 'e', 'l', 'e', 'v', 'e', 'l', 'e', 'r' };

        List<String> palindromes = findPalindromes(characters);

        System.out.println("Palindromes found:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

    public static List<String> findPalindromes(char[] characters) {
        List<String> palindromes = new ArrayList<>();

        // Iterate over all possible substrings
        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j <= characters.length; j++) {
                char[] substring = new char[j - i];
                System.arraycopy(characters, i, substring, 0, j - i);

                if (isPalindrome(substring)) {
                    palindromes.add(new String(substring));
                }
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(char[] characters) {
        int i = 0;
        int j = characters.length - 1;

        while (i < j) {
            if (characters[i] != characters[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

