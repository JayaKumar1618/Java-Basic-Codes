package jaya;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class jk47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// w.a.p to count no.of words , no.of vowels in a given string. also print the short name (first letter of every word)
// INDIAN AIR FORCE WORDS=3,VOWELS=7,SHORTNAME=I.A.F
		        DataInputStream in = new DataInputStream(System.in);

		        try {
		            System.out.print("Enter your sentence: ");
		            String s1 = in.readLine();

		            int l, i, nv = 0, nw = 1;
		            char ch;

		            l = s1.length();

		            for (i = 0; i < l; i++) {
		                ch = s1.charAt(i);

		                if ((i == 0) || (s1.charAt(i - 1) == 32)) {
		                    System.out.print(ch + ".");
		                }

		                if (ch == 32) {
		                    nw++;
		                }

		                if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') ||
		                    (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
		                    nv++;
		                }
		            }

		            System.out.println("\n\nNumber of vowels = " + nv);
		            System.out.println("Number of words = " + nw);

		        } catch (IOException x) {
		            System.out.println("Error in input data");
		        }
		    }
		}
		       