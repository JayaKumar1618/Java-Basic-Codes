package jaya;

public class jk38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={10,20,30,40,50,60,70,80,90,100};
		    int i,j,t;
		    System.out.println("THE INITIAL ARRAY IS : \n ");

		    for(i=0;i<=9;i++)
		    {
		    	  System.out.print(a[i]+" ");
		      
		    }
		    for(i=0;i<=9;i+=2)
		    {
		        j=i+1;
		        t=a[i];
		        a[i]=a[j];
		        a[j]=t;
		    }
		    System.out.println(" ");
		    System.out.println("\nAFTER THE INTER CHANGE THE ARRAY IS : \n ");
		    for(i=0;i<=9;i++)
		    {
		    	 System.out.print(a[i]+" ");
		     
		    }

	}

}
