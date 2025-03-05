import java.util.*;
class Symmetric{
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,1},{3,4},{4,3},{5,6}};
        int n=arr.length;
        int a,b,c,d;
        for(int i=0;i<n-1;i++){
            a=arr[i][0];
            b=arr[i][1];
            for(int j=i+1;j<n;j++){
                c=arr[j][0];
                d=arr[j][1];
                if(a==d && b==c){
                    System.out.println(a+","+b);
                    System.out.println(c+","+d);                    
                }
            }
        }
    }
}