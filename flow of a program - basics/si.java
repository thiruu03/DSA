//8.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principle amount : ");
        long p = s.nextLong();
        System.out.print("Enter the no of years : ");
        int n = s.nextInt();
        System.out.print("Enter the rate of interest : ");
        float r = s.nextFloat();

        double interest = (double) (p * n * r)/100; 
        System.out.println("The interest amount is  : " + interest);

    }
}
