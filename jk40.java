package jaya;

import java.util.Scanner;

public class jk40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][]=new int[3][3], b[][]=new int [3][3], c[][]=new int[3][3];
		 int i, j,x;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter A matrix: ");
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		        	x= sc.nextInt();
		        	a[i][j]=x;
		        }
		    }
		    System.out.println("Enter B matrix: ");
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		        	x= sc.nextInt();
		        	b[i][j]=x;
		        
		        }
		    }

		    // Adding matrices A and B
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		            c[i][j] = a[i][j] + b[i][j];
		        }
		    }

		    // Displaying matrix A
		    System.out.println("A matrix: ");
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		        	System.out.print(a[i][j]+"\t");
		        }
		        System.out.println(" ");
		    }

		    // Displaying matrix B
		    System.out.println("B matrix: ");
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		        	System.out.print(b[i][j]+"\t");
		        
		        }
		        System.out.println(" ");
		    }

		    // Displaying matrix C (sum of A and B)
		    System.out.println("C matrix: ");
		   
		    for (i = 0; i < 3; i++) {
		        for (j = 0; j < 3; j++) {
		        	System.out.print(c[i][j]+"\t");
		  
		        }
		        System.out.println(" ");
		    }

	}

}
