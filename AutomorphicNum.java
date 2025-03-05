import java.util.*;
class AutomorphicNum{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq = n * n ;
        if(isAutomorphic(n) == 1)
            System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
        else
            System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
	}
	
	static int isAutomorphic(int n){
    int square = n * n;
    while(n != 0)
    {
        // means not automorphic number
        if(n % 10 != square % 10){
            return 0;
        }
        // reduce down numbers
        n /= 10;
        square /= 10;
    }
    // if reaches here means automorphic number
    return 1;
    }
}
   