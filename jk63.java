package jaya;

public class jk63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=5,c=5,d;
        try
        {
        	d=a/(b-c);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("it leaads to division by zero error \n and hence i am changing the value");
        	b++;
        	d=a/(b-c);
        	System.out.println("a="+a);
        	System.out.println("b="+b);
        	System.out.println("c="+c);
        	System.out.println("d="+d);
        	
        }
	}

}
