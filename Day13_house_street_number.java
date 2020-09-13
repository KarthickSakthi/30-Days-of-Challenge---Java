
import java.util.Scanner;
public class Day13_house_street_number
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int len_of_street = s.nextInt ();
    int n = len_of_street / 2;
    for (int i = 0; i <= n; i++)
      {
      int house_num=s.nextInt();
      int opposite_house_num=0;
      if(house_num<=n){
       opposite_house_num=house_num+n;
      System.out.println(opposite_house_num);
      break;
          }
      else if(house_num>n && house_num<=len_of_street){
        opposite_house_num=house_num-n; 
        System.out.println(opposite_house_num);
        break;
        }
    else{
        System.out.println("Enetered house number is not in this street");
        break;
    }    
      }

    
  }
}

