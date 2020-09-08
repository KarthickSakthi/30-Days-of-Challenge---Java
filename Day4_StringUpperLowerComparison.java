


import java.util.Scanner;
public class Day4_StringUpperLowerComparison
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sk=s.next();
		int upper=0,lower=0;
		 for(int i=0;i<sk.length();i++){
		     char c=sk.charAt(i);
		     if(c>='A' && c<='Z'){
		         upper++;
		     }
		     else if(c>='a' && c<='z'){
		         lower++;
		     }
		 }
		 if(upper==lower){
		     System.out.println(sk.toLowerCase());
		 }
		 else{
		    System.out.println(sk.toUpperCase());
	}
}
}

