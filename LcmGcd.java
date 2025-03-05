import java.util.*;
class LcmGcd{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int gcd=1;
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}