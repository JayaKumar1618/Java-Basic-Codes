package jaya;
import java.util.Scanner;

public class jk6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,n,r,si,ci;
		Scanner sc = new Scanner(System.in);
        
	     System.out.print("Enter The Numbers: ");
	     p = sc.nextDouble();
	     n = sc.nextDouble();
	     r = sc.nextDouble();
	    si=p*n*r/100;
	    ci=p*Math.pow((1+r/100),n)-p;
	    System.out.println("SI : " + si);
        System.out.println("CI : " + ci);


	}

}
