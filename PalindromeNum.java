import java.util.*;
class PalindromeNum{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        int n1=n;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(n1==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}