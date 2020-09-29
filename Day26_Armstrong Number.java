
import java.util.Scanner;
public class Day26_Armstrong Number {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           int sum=0,t=0,m=n;

   while(n!=0){
     t=n%10;
     sum=sum +(t*t*t); 
     n=n/10; 
  }
if(sum==m){
  System.out.println("Yes! it is Armstrong Number ");}

}}
