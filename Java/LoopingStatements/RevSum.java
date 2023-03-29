import java.util.Scanner;

public class RevSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        int key = scn.nextInt();
        int rev = 0;
        int sum = 0;
        while (num > 0) {
            int d= num % 10;
            rev= rev*10 + d;
            num/=10;
        }
        System.out.println("Reverse of the number is: " + rev);
        while (key > 0) {
            int d = rev % 10;
            sum=sum+ d;
            rev/=10;
            key--;
        }
        System.out.println("Sum of the digits is: " + sum);
    }
}
