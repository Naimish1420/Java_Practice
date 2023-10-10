import java.util.*;

public class ReverseArray{

    public static void reverse(int arr[], int n){
        
        int[] b = new int[n];
        int j = n;
        for(int i=0; i<n; i++){
            b[j-1] = arr[i];
            j = j-1;
        }

        System.out.print("Reverse array is : ");

        for(int k=0; k<n; k++){
            System.out.print(b[k]+", ");
        }
    
    }

     public static void main(String[] args){

       int arr[] = {7, 6, 5, 4, 3, 2, 1};
       reverse(arr, arr.length);
       
    }
}