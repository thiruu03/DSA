import java.util.Scanner;
/**
 * sumOfAllNum
 */
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