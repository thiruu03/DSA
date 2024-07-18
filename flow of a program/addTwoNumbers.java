import java.util.Scanner;
public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum is = " + sum); 
    }
}
