import java.util.*;
class LeapYear{
    public static void main(String args[]){
        System.out.println("Enter the year:");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0&&year%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}