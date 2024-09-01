package jaya;

import java.util.Scanner;

public class jk12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int pm,cm,mm,tm,big;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Numbers: ");
	     pm = sc.nextInt();
	     cm = sc.nextInt();
	     mm = sc.nextInt();
	    if (pm>cm)
	        big=pm;
	    else
	        big=cm;
	    tm=mm+big;
	    System.out.print(tm+" is the total mark ");
	    
	}

}
