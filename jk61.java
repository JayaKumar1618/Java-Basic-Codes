package jaya;

public class jk61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a=args.length;
        	System.out.println("a="+a);
        	int c[]= {1};
        	c[42]=99;
        }
        catch (ArithmeticException e)
        {
        	System.out.println("divide by 0;"+e);
        	
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("array index oot:"+e);
        	
        }
	 System.out.println("After try catchblocks");
}
}
 