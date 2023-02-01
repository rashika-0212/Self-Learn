import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Size of array : ");
		n=sc.nextInt();
		int[] nums=new int[n];
		int target;
		System.out.println("array elements: ");
		for(int i=0;i<nums.length;i++){
		    nums[i]=sc.nextInt();
		}
		System.out.println("Target: ");
		target=sc.nextInt();
		int ans=linearsearch(nums,target);
		System.out.println("index number : " +ans);
	}
	static int linearsearch(int[] nums,int target){
	    if(nums.length==0){
	        return -1;
	    }
	    for(int i=0;i<nums.length;i++){
	        //int ele=arr[i];
	        if(nums[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}
}
