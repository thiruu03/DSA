
import java.util.Scanner;

//6.Write a program to print whether a number is even or odd, also take input from the user.
public class oddeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        if(n1 == 0){
            System.out.println("Enter a valid number");
        }

        if(n1 % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
