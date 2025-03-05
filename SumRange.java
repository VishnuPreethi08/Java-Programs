import java.util.*;
class SumRange{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}