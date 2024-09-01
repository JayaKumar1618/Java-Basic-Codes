package jaya;
import java.util.Scanner;


class box {
	private
	     float L,B,H;
	public
	Scanner sc=new Scanner(System.in);
	    void getdim() {
	    	System.out.print("Enter L :");
	    	L =sc.nextInt();
	    	System.out.print("Enter B :");
	    	B =sc.nextInt();
	    	System.out.print("Enter H :");
	    	H =sc.nextInt();
	    }
	    float volume() {
	    	return L*B*H;
	    }
	    void dispbox() {
	    	System.out.println("LENGTH :"+L);
	    	System.out.println("BREADTH :"+B);
	    	System.out.println("HEIGHT :"+H);
	    	System.out.println("VOLUME :"+volume());
	    	System.out.println("=====================================================================");
	    }
}

public class jk50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b1=new box();
		box b2=new box();
		box b3=new box();
		box bb=new box();
		
		float v1,v2,v3;
		System.out.println("ENTER BOX 1: ");
		b1.getdim();
		System.out.println("ENTER BOX 2: ");
		b2.getdim();
		System.out.println("ENTER BOX 3: ");
		b3.getdim();
		
		v1=b1.volume();
		v2=b2.volume();
		v3=b3.volume();
		
		if(v1>v2 && v2>v3) bb=b1;
		else
			if(v2>v3) bb=b2;
			else
				bb=b3;
		
		System.out.println(" BOX 1: ");
		b1.dispbox();
		System.out.println(" BOX 2: ");
		b2.dispbox();
		System.out.println(" BOX 3: ");
		b3.dispbox();
		System.out.println(" BIGGEST BOX : ");
		bb.dispbox();
		
		
		

	}

}
