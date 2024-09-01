package jaya;
import java.util.Scanner;

class Shape {
    private float x, y, z;
    private int s;

    public Shape(float a) {
           x = a;
    }

    public Shape(int a) {
           s = a;
    }

    public Shape(float a, float b) {
        x = a;
        y = b;
    }

    public Shape(float a, float b, float c) {
        x = a;
        y = b;
        z = c;
    }

    public int area(int s) {
        return s * s;
    }

    public float area(float r) {
        return (3.14f * r * r);
    }

    public float area(float a, float b) {
        return (a * b);
    }

    public float area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class jk57 {
    public static void main(String[] args) {
        int a, opt;
        float x, y, z;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Square \n");
            System.out.println("2. Rectangle \n");
            System.out.println("3. Circle \n");
            System.out.println("4. Triangle \n");
            System.out.println("5. Exit \n");
            System.out.print("Select Option: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the length of side: ");
                    a = sc.nextInt();
                    Shape s1 = new Shape(a);
                    System.out.println("Area = " + s1.area(a));
                    break;
                case 2:
                    System.out.print("Enter the length of Breath and Height: ");
                    x = sc.nextFloat();
                    y = sc.nextFloat();
                    Shape s2 = new Shape(x, y);
                    System.out.println("Area = " + s2.area(x, y));
                    break;
                case 3:
                    System.out.print("Enter the radius of circle: ");
                    x = sc.nextFloat();
                    Shape s3 = new Shape(x);
                    System.out.println("Area = " + s3.area(x));
                    break;
                case 4:
                    System.out.print("Enter 3 Sides of the Triangle: ");
                    x = sc.nextFloat();
                    y = sc.nextFloat();
                    z = sc.nextFloat();
                    Shape s4 = new Shape(x, y, z);
                    System.out.println("Area = " + s4.area(x, y, z));
                    break;
            }
        } while (opt < 5);
        System.out.println("TRY AGAIN");
        

    }
}
