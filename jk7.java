package jaya;
import java.util.Scanner;

public class jk7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float v,teta,g,rad;
		 double r;
		    g=9.8f;
		    Scanner sc = new Scanner(System.in);
	       System.out.print("Enter v and teta : ");
	       v = sc.nextFloat();
		   teta = sc.nextFloat();
		   rad=22/7.0f/180*teta;
		   r=2*v*v*Math.sin(rad)*Math.cos(rad)/g;
		   System.out.println("Radius : " + r);
	}

}
