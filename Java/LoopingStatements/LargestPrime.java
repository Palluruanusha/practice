import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        long maxNumber = scanner.nextLong();

        long largestPrime = findLargestPrime(maxNumber);

        System.out.println("The largest prime number below " + maxNumber + " is: " + largestPrime);

        scanner.close();
    }

    public static long findLargestPrime(long maxNumber) {
        if (maxNumber < 2) return -1; // There are no primes less than 2

        for (long num = maxNumber; num >= 2; num--) {
            if (isPrime(num)) {
                return num;
            }
        }
        return -1; // If no prime is found
    }

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}