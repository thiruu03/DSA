import java.util.Scanner;
// public class hcf_lcm {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n1 = s.nextInt();
//         int n2 = s.nextInt();

//         int lcm = (n1 > n2) ? n1 :n2;
//         while(true){
//             if(lcm % n1 == 0 && lcm % n2 == 0){
//                 System.out.println(lcm);
//                 break;
//             }
//             lcm++;
//         }
//     }
// }

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd = 0;

        while(n1!=n2){
            if(n1 == 0){
                gcd = n2;
                break;
            }else if(n2 == 0){
                gcd = n1;
                break;
            }
            if(n1 > n2){
                n1 = n1 - n2;
            }
            if(n2 > n1){
                n2 = n2 - n1;
            }

        }
       if(n1 == n2){
            gcd = n1;
       }
        System.out.println(gcd);
    }
}

