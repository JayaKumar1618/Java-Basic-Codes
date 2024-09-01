package jaya;

import java.util.Scanner;

public class jk10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,big;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Numbers: ");
	     a = sc.nextInt();
	     b = sc.nextInt();
	     c = sc.nextInt();
	    if ((a>b)&&(a>c))
	        big=a;
	    else
	    if (b>c) big=b;
	    else big=c;
	    System.out.print(big + " Is the Biggest Number ");
	}

}
