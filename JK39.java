package jaya;

public class JK39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,30,40,50,60,70,80,90,100};
	    int i, t;
	    System.out.println("THE INITIAL ARRAY IS : \n ");
	    for(i = 0; i < 10; i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	    for(i = 0; i < 5; i++)
	    {
	        t = a[i];
	        a[i] = a[9 - i];
	        a[9 - i] = t;
	    }
	    System.out.println(" ");
	    System.out.println("\nAFTER THE INTER CHANGE THE ARRAY IS : \n ");
	    for(i = 0; i < 10; i++)
	    {
	    	System.out.print(a[i]+" ");
	    }

	}

}
