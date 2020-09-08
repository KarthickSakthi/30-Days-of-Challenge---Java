

import java.util.*;

class Day8_Number_of_Ruby {
    public static void main(String args[] ) throws Exception {
     
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
       
        for(int i =t;i>0;i--){
            String k=s.next();
            ans(k);
        }
    }
    static void ans(String k){
        int r=0,u=0,b=0,y=0;
    for(int i=0;i<k.length();i++){
            r++;
        }
        else if(k.charAt(i)=='u'){
            u++;
        }
        else if(k.charAt(i)=='b'){
            b++;
        }
        else if(k.charAt(i)=='y'){
            y++;
        }
    }
    if(r!=0 && u!=0 && b!=0 && y!=0){
    Integer a[]={r,u,b,y};
    int min = Collections.min(Arrays.asList(a)); 
    System.out.println(min);
    }
    else{
       System.out.println("0"); 
    }
    }}

