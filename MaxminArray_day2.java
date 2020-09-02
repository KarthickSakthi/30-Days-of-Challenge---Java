
import java.util.*;
 class MaxminArray_day2
{
	public static void main(String[] args) {
	    ArrayList<Integer> b=new ArrayList<>();
		Integer a[] = {1,1,2,3,4,13,5,6,7,8,9,10};
		
		Collections.sort(Arrays.asList(a));
		b.add(Collections.max(Arrays.asList(a)));
		b.add(Collections.min(Arrays.asList(a)));
		for(int i=0;i<a.length-1;i++){
		    if(!(b.get(0)==a[i] || b.get(1)==a[i])){
		        
		        b.add(a[i]);
		            
		        
		    }
		}
		System.out.println(b);
		
		
	}
}

