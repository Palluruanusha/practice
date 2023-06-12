import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 class AlphabetsRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        boolean allAlphabetsExist = checkAlphabetsExist(inputString);
        
        if (allAlphabetsExist) {
            System.out.println("The string contains all English alphabets.");
        } else {
            System.out.println("The string does not contain all English alphabets.");
        }
    }

    public static boolean checkAlphabetsExist(String string) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
       

        string = string.toLowerCase(); // Convert string to lowercase for case-insensitive comparison

        // Check if all alphabets are present in the string
        for (char C : string.toCharArray()) {
            if (alphabetSet.contains(C)) {
                alphabetSet.remove(C);
            }
        }

        // If all alphabets have been removed from the set, then they are all present in the string
        return alphabetSet.isEmpty();
		}
		return true;
	}
 }
