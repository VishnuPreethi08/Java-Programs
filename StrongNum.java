import java.util.*;
class StrongNum{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int digit,fact,sum=0;
        while(n!=0){
            digit=n%10;
            fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(temp==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}