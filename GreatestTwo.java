import java.util.*;
class GreatestTwo{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        if(n1>n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
}