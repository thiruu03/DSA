//3.Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i = 1; i<=10; i++){
        System.out.println(i + " * "+ n + " = " + i*n);
    }
}
}