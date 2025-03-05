import java.util.*;
class Fibo{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c+" ");
        }
    }
}