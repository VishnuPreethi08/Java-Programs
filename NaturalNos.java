import java.util.*;
class NaturalNos{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n*(n+1)/2);
    }
}