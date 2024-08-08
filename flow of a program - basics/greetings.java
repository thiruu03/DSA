//7.Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();

        System.out.println("Welcome" + " "+ name);
    }
}
