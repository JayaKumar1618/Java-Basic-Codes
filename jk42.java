package jaya;
import java.util.Scanner;
public class jk42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        int a[][] = new int[3][3];
		        int b[][] = new int[3][3];
		        int c[][] = new int[3][3];

		        System.out.println("Enter A matrix:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                a[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.println("Enter B matrix:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                b[i][j] = scanner.nextInt();
		            }
		        }

		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                c[i][j] = 0;
		                for (int k = 0; k < 3; k++) {
		                    c[i][j] += a[i][k] * b[k][j];
		                }
		            }
		        }

		        System.out.println("A matrix:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(a[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        System.out.println("B matrix:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(b[i][j] + "\t");
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

