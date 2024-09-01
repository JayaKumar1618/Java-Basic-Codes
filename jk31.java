package jaya;

import java.util.Scanner;

public class jk31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,x,dt,d;
			 Scanner sc = new Scanner(System.in);
		        System.out.print("Enter The Number: ");
		        n= sc.nextInt();
		    x=n;
		    dt=0;
		    while(x>0)
		    {
		        d=x%10;
		        dt+=d;
		        System.out.println(x+"\t"+d+"\t"+dt+"\n");
		        x/=10;

		    }
		    System.out.print("Digit Total = "+dt);


	}

}
