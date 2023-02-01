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
		int ans=min(nums);
		System.out.println("min number : " +ans);
	}
	static int min(int[] nums){
	    int mini=nums[0];
	    if(nums.length==0){
	        return 0;
	    }
	    for(int i=0;i<nums.length;i++){
	        if(mini>nums[i]){
	            mini=nums[i];
	        }
	    }
	    return mini;
	}
}
