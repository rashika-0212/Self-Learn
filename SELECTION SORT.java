import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();//3 4 5 2 1
        }
        selection(arr);
        /*for(int i : arr){
            System.out.println(arr[i]);
        }*/
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int first=getMaxIndex(arr,0,last);
            swap(arr,first,last);
        }
    }
    static int getMaxIndex(int[] arr,int first,int last){
        int max=first;;
        for(int i=first;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
