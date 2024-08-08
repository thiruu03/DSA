//5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;
public class sumOfAllNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p;
        int sum = 0;

        while(true){
            p = s.next();
           if( p.equals("x")){
            break;
           }else{
            sum+= Integer.parseInt(p);
           }
        }
        System.out.println(sum);
    }
}