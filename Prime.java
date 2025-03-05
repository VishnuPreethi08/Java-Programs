import java.util.*;
class Prime{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
           for(int i=2;i<n;i++){
              if(n%i==0){
                isPrime=false;
                break;
              }
           
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}