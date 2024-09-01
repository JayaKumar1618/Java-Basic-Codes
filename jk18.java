package jaya;

import java.util.Scanner;

public class jk18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
	    String a="";
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
	    b = sc.nextInt();
	    switch(b)
	    {
	        case 1: a="ONE";
	               break;
	        case 2: a="TWO";
	               break;
	        case 3: a="THREE";
	               break;
	        case 4: a="FOUR";
	               break;
	        case 5: a="FIVE";
	               break;
	        case 6: a="SIX";
	               break;
	        case 7: a="SEVEN";
	               break;
	        default:
	            System.out.print("More Than 7");
	    }
	    System.out.print("The number Is "+a);

	}

}
