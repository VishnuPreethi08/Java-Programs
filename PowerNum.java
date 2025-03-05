import java.util.*;
class PowerNum{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;int sum=0;int digit,fact;
        while(temp>0){
            digit=temp%10;
            fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}