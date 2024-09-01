package jaya;

import java.util.Scanner;

public class jk25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,s;
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter The Number: ");
	        n= sc.nextInt();
		    s=0;
		    for(i=2;i<n;i++){
		        if(n%i==0){
		            s=1;
		            break;
		        }
		    }
		    if (s==0)
		    	 System.out.println(" THE NUMBER IS PRIME ");
		    else
		    	 System.out.println(" THE NUMBER IS NOT PRIME ");



	}

}
