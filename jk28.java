package jaya;

import java.util.Scanner;

public class jk28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Number: ");
	        n= sc.nextInt();
		    double sum,i;
		    sum =1;
		    for ( i = 0; i < n; ++i) {
		        sum += (double)i / (i + 1);
		    }
		    System.out.println("The sum of the series is: "+sum);
		   



	}

}
