package jaya;

import java.util.Scanner;

public class jk32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,dt,d,m,s;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        n= sc.nextInt();
	    x=n;
	    dt=0;
	    m=1;

	    while(x>0)
	    {
	        d=x%10;
	        dt=dt+d*m;
	        System.out.print(x+"\t"+d+"|t"+m+"\t"+dt+"\n");
	        x/=10;
	        m=m*2;


	    }
	    System.out.print("Digit Total = "+dt);

	}

}
