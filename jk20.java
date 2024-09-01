package jaya;

import java.util.Scanner;

public class jk20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b;
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Seat Number: ");
		    b = sc.nextInt();

		    String a="";

		    if (b > 79) {
		        a = "INVALID";
		    } else {
		        switch(b % 8) {
		            case 0: a = "SIDE UPPER";
		                    break;
		            case 1: a = "LEFT LOWER";
		                    break;
		            case 2: a = "LEFT MIDDLE";
		                    break;
		            case 3: a = "LEFT UPPER";
		                    break;
		            case 4: a = "RIGHT LOWER";
		                    break;
		            case 5: a = "RIGHT MIDDLE";
		                    break;
		            case 6: a = "RIGHT UPPER";
		                    break;
		            case 7: a = "SIDE LOWER";
		                    break;
		        }
		    }
		    System.out.print("The Seat Number is : "+a);



	}

}
