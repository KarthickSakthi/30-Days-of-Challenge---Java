
import java.util.Scanner;
 class Day6_Primenumber
{
	public static void main(String[] args) {
		
		boolean isprime=true;
		for(int n=1;n<=100;n++){
		    if(n!=1){
		    prime(n,isprime);}
		}
		
		
	}
	static void prime(int n,boolean isprime){
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        isprime=false;
		        break;
		    }
		}
		if(isprime){
		    System.out.print(n + " ");
		}
	
	}
}

