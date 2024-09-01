package jaya;

import java.util.Scanner;

public class jk21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b;
		    String a="";
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Seat Number: ");
		    b = sc.nextInt();
		    switch(b)
		    {
		        case 1: a="MONDAY";
		               break;
		        case 2: a="TUESDAY";
		               break;
		        case 3: a="WEDNESDAY";
		               break;
		        case 4: a="THURSDAY";
		               break;
		        case 5: a="FRIDAY";
		               break;
		        case 6: a="SATURDAY";
		               break;
		        case 7: a="SUNDAY";
		               break;
		        default:
			        System.out.print("Invalid Number");
		    }
		    System.out.print("The day is : "+a);

	}

}
