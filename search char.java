import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter a string: ");
		name=sc.nextLine();
		char target;
		System.out.println("Target: ");
		target=sc.next().charAt(0);
		System.out.println(linearsearch(name,target));
	}
	static boolean linearsearch(String name,char target){
	    if(name.length()==0){
	        return false;
	    }
	    for(int i=0;i<name.length();i++){
	        if(name.charAt(i)==target){
	            return true;
	        }
	    }
	    return false;
	}
}
