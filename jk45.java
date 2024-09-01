package jaya;
public class jk45 {
	    public static void main(String[] args) {
	        int a[][] = new int[5][5];

	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == j)
	                    a[i][j] = 0;
	                else if (i < j)
	                    a[i][j] = 1;
	                else
	                    a[i][j] = -1;
	            }	            
	        }

	        System.out.println("CUSTOM MATRIX:");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(a[i][j] + "\t");
	            }
	            System.out.println("\n");
	        }
	    }
	}