
import java.util.*;


class Day12_MaxWeigh_Value{
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=1;i<=t;i++){
        int n =s.nextInt();
        int w=s.nextInt();
        res(n,w);
        }
    }
    
  static void res(int n,int w){
        Scanner s = new Scanner(System.in);
        int wei[]=new int[n];
        int v[]=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        
        for (int i=0;i<n;i++){
            wei[i]=s.nextInt();
            v[i]=s.nextInt();
        } 
        
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ 
            int sum=0,valsum=0;
            sum=wei[i]+wei[j];
            
            if(sum<=w){
                valsum=v[i]+v[j];
                a.add(valsum);
            }
            
        } }
        System.out.println(a); 
        System.out.println(Collections.max(a)); 
    }
}

