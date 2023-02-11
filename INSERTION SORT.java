import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array :");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr){
        
        for(int i=0;i<= arr.length-2 ;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int j,int prev){
        prev=j-1;
        int temp=arr[j];
        arr[j]=arr[prev];
        arr[prev]=temp;
    }
}
