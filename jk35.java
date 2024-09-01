package jaya;

public class jk35 {
	    public static void main(String[] args) {
	
	        for (int n = 1; n <= 15; n++) {
	            for (int k = 1; k <= 35 - n * 2; k++) {
	                System.out.print(" ");
	            }
	            for (int m = 1; m <= n; m++) {
	                System.out.print("  $ ");
	            }
	            System.out.println();
	        }
	        for (int n = 15; n >= 1; n--) {
	            for (int k = 1; k <= 35 - n * 2; k++) {
	                System.out.print(" ");
	            }
	            for (int m = 1; m <= n; m++) {
	                System.out.print("  $ ");
	            }
	            System.out.println();
	        }
	    }
	}



