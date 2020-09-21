import java.util.*;
public class Day21_OddPlaceAsc_EvenPlaceDesc
{                                                                     // Input: 13,2 4,15,12,10,5
                                                                     //Output: 13,2,12,10,5,15,4
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);                              // Input: 1,2,3,4,5,6,7,8,9  Output: 9,2,7,4,5,6,3,8,1 
	int n = s.nextInt();
	boolean e=true;
	int j=0,k=0;
	ArrayList<Integer> a= new ArrayList<>();
	ArrayList<Integer> b= new ArrayList<>();
	ArrayList<Integer> c= new ArrayList<>();
	ArrayList<Integer> d= new ArrayList<>();
	for(int i=0;i<n;i++){
	    a.add(s.nextInt());
	}
	for(int i=0;i<a.size();i++){
	    if(i%2==0){
	        b.add(a.get(i));
	    }
	    else{
	        c.add(a.get(i));
	        }
	}
	Collections.sort(b,Collections.reverseOrder());
	Collections.sort(c);
	for(int i=0;i<a.size();i++){
	    if(e){
	       d.add(b.get(j++)); 
	    }
	    else{
	       d.add(c.get(k++)); 
	    }
	    e=!e;
	}
	
	System.out.println(d);
	
	
	
	}
}

