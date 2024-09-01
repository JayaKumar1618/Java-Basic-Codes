package jaya;

import java.util.Scanner;

public class jk24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n,s,i;
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Number: ");
	        n= sc.nextInt();
	    s=0;
	    for(i=2;i<=n;i+=2)
	        s+=i;
	    System.out.print("The Sum Is "+s);

	}

}
