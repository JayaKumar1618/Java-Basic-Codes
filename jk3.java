package jaya;
import java.util.Scanner;

public class jk3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter the first number: ");
		 int num1 = scanner.nextInt();
		 
		 System.out.print("Enter the second number: ");
		 int num2 = scanner.nextInt();
		 
		 int result = num1 * num2;
		 
		 System.out.println("The result of multiplication is: " + result);
		 
		 scanner.close();
		 }
		}