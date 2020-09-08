
import java.util.*;
 class Day3_LongestCommonSubsequence
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    String k = s.next ();
    String l = s.next ();
    char[] k1 = k.toCharArray();
    char[] l1 = l.toCharArray();
    Set < Character> a = new LinkedHashSet <> ();
    Set<Character> b = new LinkedHashSet<>();
    for (int i = 0; i < k1.length; i++){
	a.add(k1[i]);
      }
      for (int i = 0; i < l1.length; i++){
	b.add(l1[i]); 
      }
      System.out.println(a);
      System.out.println(b);
     Set<Character> c =new LinkedHashSet<>(a);
     c.retainAll(b);
     System.out.println(c+" length : "+c.size());
     
     
  }
}

