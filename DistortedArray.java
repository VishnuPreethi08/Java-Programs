import java.util.*;
class DistortedArray{
    public static void main(String[] args){
        int arr[]={1,2,2,2,3,4};
        int n=arr.length;
        System.out.println(arr[0]);
        for(int i=1;i<n;i++){
            if((arr[i]!=arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }   
}
      