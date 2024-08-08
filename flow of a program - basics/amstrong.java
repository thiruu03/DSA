//9.Amstrong Number
public class amstrong {
    public static void main(String[] args) {
      //  long num = 370;
      //  long isams = num;
      //  long ams = 0;
      //  String num2 = String.valueOf(num);

      //  while(num>0){
      //   long rem = (long) num%10;
      //    ams += Math.pow(rem,num2.length());
      //    num/=10;
      //  }
      //  System.out.println(ams);
      //  if(ams == isams){
      //   System.out.println("Amstrong");
      //  }else{
      //   System.out.println("Not a Amstrong");
      //  }

      int n1 = 350;
      int n2 = 390;
      String val = String.valueOf(n1); 
      int ans = 0;

      for(int i = n1; i<=n2; i++){
        if(i>0){
          int rem = i % 10;
          ans+=Math.pow(rem,val.length());
          i/=10;
        }
        System.out.println(i);
    }
}
}
