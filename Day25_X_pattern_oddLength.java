import java.util.*;
class Day25_X_pattern_oddLength{
public static void main (String[] args){   
  Scanner s=new Scanner(System.in);
    String str = s.next();
    int len = str.length();

 for (int i = 0; i < len; i++)
    {
        int j = len - 1 - i;
        for (int k = 0; k < len; k++)
        {
            if (k == i || k == j)
                System.out.print(str.charAt(k));
            else
                System.out.print(" ");
        }
        System.out.println();
    }
 
 }
}
 