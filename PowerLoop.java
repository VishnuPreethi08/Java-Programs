import java.util.*;
class PowerLoop{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=s.nextInt();
        System.out.println("Enter the exponent:");
        int exponent=s.nextInt();
        int ans=1;
        for(int i=0;i<=exponent;i++){
           ans*=base;
        }
        System.out.println(ans);
    }
}
        