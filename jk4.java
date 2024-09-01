package jaya;
import java.util.Scanner;

public class jk4 {
    public static void main(String[] args) {
        int x, y, a, s, m, d,o;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The First Number: ");
        x = sc.nextInt();
        
        System.out.print("Enter The Radius: ");
        y = sc.nextInt();
        
        a=(x+y);
        s=(x-y);
        m= x*y;
        d= x/y;
        o= x%y;
        
        System.out.println("Addition: " + a);
        System.out.println("Subraction: " + s);
        System.out.println("Multiplication: " + m);
        System.out.println("Division: " + d);
        System.out.println("Modulus: " + o);
        
     
    }
}
