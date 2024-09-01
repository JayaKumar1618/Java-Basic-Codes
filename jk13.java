package jaya;

import java.util.Scanner;

public class jk13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int hw,wa,conv,total,rem;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
	    hw = sc.nextInt();
	    if (hw<=8)
	    {
	        wa=100*hw;
	        conv=25;
	    }
	    else
	    {
	        rem=hw-8;
	        wa=(100*8)+(150*rem);
	        conv=50;
	    }
	    total=wa+conv;
	    System.out.print(total+" is the total ");

	}

}
