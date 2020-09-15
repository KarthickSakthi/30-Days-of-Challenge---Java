
public class Day15_Matrix_Spiralform
{
	public static void main(String[] args) {
		int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		spiralform(a);
	}
	
	static void spiralform(int a[][]){
	    int firstrow=0;
	    int lastrow=a.length-1;                       // 1 2 3 6 9 8 7 4 5
	    int firstcol=0;
	    int lastcol=a[0].length-1;
	    
	    while(firstrow<=lastrow && firstcol<=lastcol){
	    for(int i=firstcol;i<=lastcol;i++){
	        System.out.println(a[firstrow][i]);
	    }
	    
	    for(int i=firstrow+1;i<lastrow;i++){
	        System.out.println(a[i][lastcol]);
	    }
	    
	    for(int i=lastcol-1;i>=firstcol;i--){
	        System.out.println(a[lastrow][i]);
	    }
	    
	    for(int i=lastrow-1;i>firstcol;i--){
	        System.out.println(a[i][firstcol]);
	    }
	    firstrow++;
	    lastrow--;
	    firstcol++;
	    lastcol--;
	    }
   }
}
