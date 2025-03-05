import java.util.*;
class GreatestThree{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
}