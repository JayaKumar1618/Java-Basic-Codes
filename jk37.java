package jaya;

import java.util.Scanner;

public class jk37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,big,small,bp,sp,tot,x;
	    float avg;
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 10 Number: ");
	    for(i=0;i<10;i++) {
	    	 System.out.print("Enter"+i+"Number: ");
          x= sc.nextInt();
          a[i]=x; 
	    }
	    tot=0;
	    big=a[0];bp=0;
	    small=a[0];sp=0;
	    for(i=0;i<10;i++)
	    {
	    	tot+=a[i];
	        if(a[i]>big)
	        {
	            big=a[i];
	            bp=i;
	        }
	        if(a[i]<small)
	        {
	            small=a[i];
	            sp=i;
	        }
	    }
	    avg=tot/10.0f;
	    System.out.println("THE BIG IS ="+big+"\t"+"POSITION ="+bp);
	    System.out.println("THE SMALL IS ="+small+"\t"+"POSITION ="+sp);
	    System.out.println("THE TOTAL IS ="+tot+"\t"+"THE AVERAGE IS ="+avg);
	}

}
