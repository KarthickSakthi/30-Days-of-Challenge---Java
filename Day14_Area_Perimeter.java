
import java.util.Scanner;
public class Day14_Area_Perimeter
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		
		if(a==b){
		    int area_of_Square=a*b;
		    System.out.println("area_of_Square : "+area_of_Square);
		}
		else{
		    int perimeter_of_rectangle=2*(a+b);
		    System.out.println("perimeter_of_rectangle : "+perimeter_of_rectangle);
		}
	}
	
}

