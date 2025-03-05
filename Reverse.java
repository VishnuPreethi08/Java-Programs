import java.util.*;
class Reverse{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}