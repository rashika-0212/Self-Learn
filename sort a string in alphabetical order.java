import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String str=sc.next();
		char[] arr=str.toCharArray();
		int i,j;
		char ch;
		for (i=0;i<arr.length;i++){
		    for(j=i+1;j<arr.length;j++){
		        if(arr[i]>arr[j]){
		            ch=arr[i];
		            arr[i]=arr[j];
		            arr[j]=ch;
		        }
		    }
		}
		for(i=0;i<arr.length;i++){
		System.out.print(arr[i]);
		}
	}
}
