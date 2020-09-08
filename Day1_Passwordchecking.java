import java.util.*;

public class Day1_Passwordchecking
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		String sk =s.next();
		String specialchars="\\/,.?{};:'+=-_()*&^%$#@!`~|<>";
		String numbers="1234567890";
		System.out.println(password(sk,specialchars,numbers));
	}
	static String password(String sk,String specialchars,String numbers){
	    
	    int couupper=0,couspecialchar=0,counumber=0;
	    String sk2=sk.toUpperCase();
	    if(sk.length()>=8 ){
	        for(int i=0;i<sk.length();i++){
	            for(int j=0;j<sk2.length();j++){
	            if(Character.isUpperCase(sk.charAt(j))){
	                couupper++;
	            }}
	            for(int k=0;k<specialchars.length();k++){
	            if(sk.charAt(i)==specialchars.charAt(k)){
	                couspecialchar++;
	            }}
	            for(int l=0;l<numbers.length();l++){
	            if(sk.charAt(i)==numbers.charAt(l)){
	                counumber++;
	            }}
	        }
	        
	       if(couupper>=1 && couspecialchar>=1 && counumber>=1){
	          
	          return "Strong Password";
	         
	       }
	       else{
	           
	           return "Weak Password,try Other!";
	       }
	       
	    }
	    else{
	        return "Invalid Password";
	    }
	}
}
