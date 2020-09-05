
import java.util.*;
 class ReplaceString_day5
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n=s.next();
		int a[] = new int[n.length()];
		for(int i=0;i<n.length();i++){
		    a[i]= Character.getNumericValue(n.charAt(i));
		}
		for(int i=0;i<a.length;i++){
		    if(a[i]<5){
		        a[i]=0;
		    }
		    else if(a[i]>=5){
		        a[i]=1;		    }
		}
		System.out.println(Arrays.toString(a));
		
	}
}
