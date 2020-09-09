
import java.util.*;
public class Day9_Max_Min_format_in_Array
{
	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,8,7,6,5};//{1,2,3,4,5,6,7,8}
		int b[]=new int[a.length];
		int size=a.length;
		int k=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
		    int j=i;
		    if(i%2==0){
		    b[i]=a[--size];}
		    else{
		        b[i]=a[k++];
		    }
		    
		}
		System.out.println(Arrays.toString(b));
	}
}


