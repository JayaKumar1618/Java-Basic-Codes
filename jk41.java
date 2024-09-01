package jaya;

import java.util.Scanner;

public class jk41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, i, j, temp;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number of terms : ");
	     n= sc.nextInt();
		  

		    int a[]=new int[n];
		    System.out.println("Enter"+n+"terms :");
		    for (i = 0; i < n; i++) {
		    	 System.out.println("Term"+":");
		    	  n= sc.nextInt();
		    	  a[i]=n;
		    }
		    System.out.println(" ");
		    System.out.println("The initial array is: ");
		    for(i = 0; i < n; i++) {
		    	  System.out.print(a[i]+" ");
		    }
		    for (i = 0; i < n - 1; i++) {
	            for (j = 0; j < n - i - 1; j++) {
	                if (a[j] > a[j + 1]) {
	                    temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }
	        
	        System.out.println("The array in ascending order is: ");
	        for (i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
		    
	}

}
