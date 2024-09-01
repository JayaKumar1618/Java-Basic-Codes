package jaya;

import java.util.Scanner;

public class jk19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
	    String a="";
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
	    b = sc.nextInt();
	    switch(b)
	    {
	        case 12:
	        case 2:
	        case 1: a="WINTER";
	               break;
	        case 3:
	        case 4:
	        case 5: a="SUMMER";
	               break;
	        case 6:
	        case 7:
	        case 8: a="SPRING";
	               break;
	        case 9:
	        case 10:
	        case 11: a="RAINY";
	               break;

	        default:
	            System.out.print("Invalid Month ");
	    }
	     System.out.print("The Month is "+a);

	}

}
