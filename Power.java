import java.util.*;
class Power{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        double n1=s.nextDouble();
        double n2=s.nextDouble();
        double res=Math.pow(n1,n2);
        System.out.println(res);
    }
}
        