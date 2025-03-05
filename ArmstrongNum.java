import java.util.*;
public class ArmstrongNum{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=s.nextInt();
    int temp=n,exponent=0,sum=0;
    while(temp>0){
       temp=temp/10;
       exponent++;
    }
    temp=n;
    while(temp>0){
      int base=temp%10;
      sum+=Math.pow(base,exponent);
      temp=temp/10;
    }
    if(n==sum){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not a sArmstrong number");
    }
  }
}