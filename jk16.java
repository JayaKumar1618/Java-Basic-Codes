package jaya;

import java.util.Scanner;

public class jk16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double r1,r2,a,b,c,r;
		    double d;
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Value a,b,c: ");
		     a = sc.nextDouble();
		     b = sc.nextDouble();
		     c = sc.nextDouble();
		    d=((b*b)-(4*a*c));
		    if (d>0)
		    {
		        r1=-b+Math.sqrt(d)/(2*a);
		        r2=-b-Math.sqrt(d)/(2*a);
		        System.out.println("the real root of r1 is "+r1);
		        System.out.println("the real root of r2 is "+r2);
		    }
		    else
		    if (d<0)
		    {
		    	 System.out.println("the roots are imaginary");
		    }
		    else
		    if (d==0)
		    {
		        r=-b/2*a;
		        System.out.println("Equal root is "+r);
		

		    }
	}

}
