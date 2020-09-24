import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Integer a[] = {2,4,5,6,7,9,10,13};
		Integer b[] = {2,3,4,5,6,7,8,9,11,15};
	 ArrayList<Integer> a1=new ArrayList<>();             
	 a1.addAll(Arrays.asList(a));
	 a1.addAll(Arrays.asList(b));
	 Collections.sort(a1);
	 Set<Integer> s = new LinkedHashSet<>(a1);
	 System.out.println(s);
	}
}
//output:2,3,4,5,6,7,8,9,10,11,13,15 
