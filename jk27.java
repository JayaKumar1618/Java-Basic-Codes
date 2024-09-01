package jaya;

import java.util.Scanner;

public class jk27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,s,i;
			 Scanner sc = new Scanner(System.in);
		        System.out.print("Enter The Number: ");
		        n= sc.nextInt();
		    s=1;
		    for(i=1;i<=n;i++){
		        s*=i;
		    }
		    System.out.print("the factorial is "+s);



	}

}
