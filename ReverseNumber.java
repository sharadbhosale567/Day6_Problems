package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : -");
        int num = sc.nextInt();
        int reversed = 0;
        System.out.println("Original number : - " + num);
        while ( num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;

        }
        System.out.println("Reversed Number : - " + reversed);
    }
}
