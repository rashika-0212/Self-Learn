import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        /*for(int i : arr){
            System.out.println(arr[i]);
        }*/
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return;
    }
}
