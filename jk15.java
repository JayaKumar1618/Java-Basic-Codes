package jaya;

import java.util.Scanner;

public class jk15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float unit,bill;
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Units Used: ");
		     unit = sc.nextFloat();	
		    if (unit<=100) bill=0;
		    else
		    if (unit<=200) bill=100*0+((unit-100)*1.50f);
		    else
		    if (unit<=300) bill=100*0+(100*1.50f)+((unit-200)*2.50f);
		    else
		    if (unit<=500) bill=100*0+(100*1.50f)+(100*2.50f)+((unit-300)*4.00f);
		    else
		      bill=100*0+(100*1.50f)+(100*2.50f)+(200*4)+((unit-500)*5.50f);
		    System.out.println(bill+" is the bill tobe paid ");
	

	}

}
