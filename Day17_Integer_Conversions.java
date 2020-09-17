
public class Day17_Integer_Conversions
{
	public static void main(String[] args) {
	   int a=12;
	   String binary,octal,hexadecimal;
	   binary=Integer.toBinaryString(a);
	   System.out.println("Integer to String : "+binary);
	   octal=Integer.toOctalString(a);
	   System.out.println("Integer to Octal : "+octal);
	   hexadecimal=Integer.toHexString(a);
	   System.out.println("Integer to Hexadecimal : "+hexadecimal);
	}
}
