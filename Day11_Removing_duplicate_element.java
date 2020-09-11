
import java.util.*;


class Day11_Removing_duplicate_element{
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        Set<Integer> k=new LinkedHashSet<>();

        for (int i=0;i<n;i++){
            k.add(s.nextInt());
        }
        Iterator<Integer> i = k.iterator(); 
        while (i.hasNext()) 
            System.out.print(i.next() +" "); 

    }
}
