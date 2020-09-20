
import java.util.Scanner;
 class Day19_Buddy_pairs
{
	public static void main(String[] args) {
	    Main main= new Main();
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int j=main.divisor(n)-1;
		int k=main.divisor(m)-1;
		if(n==k && m==j){
		    System.out.println("buddy("+n+","+m+")");
		}
		else{
		    System.out.println("Nothing");
		}
}
 	int divisor(int d){
	    int sum=0;
	    for(int i=1;i<d;i++){
	        if(d%i==0){
	            sum=sum+i;
	        }
	    }
	    System.out.println(sum);
	   return sum; 
	}	    
	
}

