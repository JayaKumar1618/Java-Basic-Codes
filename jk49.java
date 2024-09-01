package jaya;
import java.io.*;
public class jk49 {
	    public static void main(String[] args) {
	        DataInputStream in = new DataInputStream(System.in);
	        String S1 = "", S2 = "";

	        try {
	            System.out.print("Enter a string: ");
	            S1 = in.readLine();

	            int L = S1.length();
	            for (int i = L - 1; i >= 0; i--) {
	                char ch1 = S1.charAt(i);
	                S2 = S2 + ch1;
	            }

	            System.out.println("REVERSE = " + S2);
	            if (S1.compareTo(S2) == 0) {
	                System.out.println("PALINDROME");
	            } else {
	                System.out.println("NOT A PALINDROME");
	            }

	        } catch (IOException e) {
	            System.out.println("Error in input data");
	        }
	    }
	}



