
 class Day30_FindingDatatype_and_itsSize  // 30 Days of java challenge Completed
{
	public static void main(String[] args) {
	    Byte a=1;
	    Short b=2;
	    Integer c=3;
	    Long d=12345678910l;
	    Float e=0.34f;
	    Double f=0.33334444555555;
	    Character g='a';
	    String h="Data type";
	    Object Datatype[] = new Object[]{a,b,c,d,e,f,g,h}; 
	    System.out.println("----- 7 Data type and it's size -----");
		System.out.println("byte size is : "+Byte.SIZE/8);
		System.out.println("short size is : "+Short.SIZE/8);
		System.out.println("int size is : "+Integer.SIZE/8);
		System.out.println("long size is : "+Long.SIZE/8);
		System.out.println("float size is : "+Float.SIZE/8);
		System.out.println("double size is : "+Double.SIZE/8);
		System.out.println("char size is : "+Character.SIZE/8);
		System.out.println("----- Finding Data type -----");
		
		    if(a instanceof Byte)
		        System.out.println(a+": a is byte" );
		    if(b instanceof Short)
		        System.out.println(b+": b is short" );  
		        
		    if(c instanceof Integer)
		        System.out.println(c+": c is int" );    
		        
		    if(d instanceof Long)
		        System.out.println(d+": d long" );    
		        
		    if(e instanceof Float)
		        System.out.println(e+": e is float" );   
		        
		    if(f instanceof Double)
		        System.out.println(f+": f is double" );   
		    if(g instanceof Character)
		        System.out.println(g+": g is char" );   
		    if(h instanceof String)
		        System.out.println(h+" h is String" );    
		        
		
		}
}

