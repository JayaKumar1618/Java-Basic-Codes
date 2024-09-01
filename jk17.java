package jaya;

import java.util.Scanner;

public class jk17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
	    String rem="";
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The cast: ");
	    a = sc.nextInt();
	    switch(a)
	    {
	        case 1: rem="fc";
	               break;
	        case 2: rem="bc";
	               break;
	        case 3: rem="obc";
	               break;
	        case 4: rem="oc";
	               break;
	        default:
	        	System.out.print("Invalid cast");
	    }
	    System.out.print("The cast is "+rem);


	}

}
