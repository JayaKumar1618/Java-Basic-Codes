package jaya;

import java.util.Scanner;

public class jk14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,m4,m5,total,avg;
	    char g;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The marks: ");
	     m1 = sc.nextInt();
	     m2 = sc.nextInt();
	     m3 = sc.nextInt();
	     m4 = sc.nextInt();
	     m5 = sc.nextInt();
	    total=m1+m2+m3+m4+m5;
	    avg=total/5;
	    if (avg>=90) g='A';
	    else
	    if (avg>=75) g='B';
	    else
	    if (avg>=60) g='C';
	    else
	    if (avg>=50) g='D';
	    else
	    if (avg>=40) g='E';
	    else
	        g='F';
	    System.out.println(total+" is the total mark ");
	    System.out.println(avg+" is the average mark");
	    System.out.println(g+" is the overall grade");
	    
	}

}
