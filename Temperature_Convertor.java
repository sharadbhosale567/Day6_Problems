package Practice;

import java.util.Scanner;

public class Temperature_Convertor {

    static double celsius(double f)
    {
        return (f - 32 ) * (0.55) ;
    }
    public static void main(String[] args)
    {
        double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature : - ");
        f = sc.nextDouble();
        System.out.println("Celsius Temperature is = " + celsius(f));
    }

}
