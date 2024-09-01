package jaya;
import java.util.Scanner;
public class jk43 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a[][] = new int[3][3];
	        int c[][] = new int[3][3];

	        System.out.println("Enter A matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                a[i][j] = scanner.nextInt();
	            }
	        }


	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                c[i][j] = a[j][i];
	            }
	        }
	        System.out.println("A matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(a[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        System.out.println("C matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(c[i][j] + "\t");
	            }
	            System.out.println();
	        }


	    }
	}


