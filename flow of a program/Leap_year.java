import java.util.Scanner;
class Leap_year{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        //If the year must be divisible by 400 it is a leap year 
        //Or the year must be divisibe by 4 and not divisible b by 100 
      if(year % 400 == 0 || ((year % 100 !=0) && (year % 4 == 0))){
        System.out.println("Leap Year");
      }else{
      System.out.println("Not a Leap Year");
      }
    }
}