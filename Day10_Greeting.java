
import java.util.*;
public class Day10_Greeting
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name=s.next();
		System.out.println(greeting(name));
		
	}
	static String greeting(String name){
	    return "Hello, "+name+" how are you doing today?";
	}
}

