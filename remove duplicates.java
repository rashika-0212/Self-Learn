import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n,j=0;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int[] temp=new int[n];
		
		for(int i=0;i<n-1;i++){
		    if(arr[i]!=arr[i+1]){
		        temp[j]=arr[i];
		        j++;
		    }
		}
		//j++;
		temp[j++]=arr[n-1];
		
		for (int i=0; i<j; i++)  {
           System.out.print(temp[i]+" ");
	    }
	}
}
