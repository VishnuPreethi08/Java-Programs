import java.util.*;
class Rotate{
    public static void main(String srgs[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int d=3;
        for(int i=0;i<d;i++){
            int firstelement=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=firstelement;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}