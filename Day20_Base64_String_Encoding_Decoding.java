
import java.util.*;
 class Day20_Base64_String_Encoding_Decoding
{
	public static void main(String[] args) {
	
	System.out.println("=====original String=====");
	String s=" hi Karthick";
	System.out.println(s);
	System.out.println("=====Encoded String=====");
	String Base64encoding = Base64.getEncoder().encodeToString(s.getBytes());
	System.out.println(Base64encoding);
	System.out.println("=====Decoded String=====");
    byte[] decode=Base64.getDecoder().decode(Base64encoding);
	String Base64Decoding = new String(decode);
	System.out.println(Base64Decoding);
	}
}

