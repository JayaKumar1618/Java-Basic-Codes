package jaya;

import java.util.Scanner;

public class jk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r, a, p;

		 Scanner sc = new Scanner(System.in);
	        
	     System.out.print("Enter The Number: ");
	     r = sc.nextFloat();

	    a = 22.0f / 7.0f * r * r;
	    p = 2 * 22.0f / 7.0f * r;
	    System.out.println("Area : " + a);
        System.out.println("Perimeter : " + p);

	}

}
