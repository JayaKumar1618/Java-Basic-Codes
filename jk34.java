package jaya;

public class jk34 {
	    public static void main(String[] args) {
	        for (long n = 1; n <= 10000000000L; n++) {
	            long sum = 0;
	            for (long m = 1; m < n; m++) {
	                if (n % m == 0) {
	                    sum += m;
	                }
	            }
	            if (sum == n) {
	                System.out.print("\t" + n + "  ");
	            }
	        }
	    }
	}


