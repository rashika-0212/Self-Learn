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
        System.out.println(Arrays.toString(MergeSort(arr)));
    }
    public static int[] MergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=(arr.length)/2;
        int[] left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
