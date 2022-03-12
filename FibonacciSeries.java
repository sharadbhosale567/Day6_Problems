package Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : - ");
        int N = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int nextnumber;
        System.out.println("Fibonacci Series till  "  + N +  " term : ");

        for (int i=1; i<=N; ++i) {
            System.out.print(firstNumber + " , ");
            nextnumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextnumber;
        }
    }
}
