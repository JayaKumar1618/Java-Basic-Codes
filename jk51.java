package jaya;
import java.util.Scanner;

class Cylinder {
    private float radius, height;
    public Scanner sc = new Scanner(System.in);

    void getDimensions() {
        System.out.print("Enter radius: ");
        radius = sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();
    }

    float volume() {
        return (float) (Math.PI * Math.pow(radius, 2) * height);
    }

    void displayCylinder() {
        System.out.println("RADIUS: " + radius);
        System.out.println("HEIGHT: " + height);
        System.out.println("VOLUME: " + volume());
        System.out.println("=====================================================================");
    }
}

public class jk51 {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder();
        Cylinder c3 = new Cylinder();
        Cylinder biggest = new Cylinder();

        float v1, v2, v3;
        System.out.println("ENTER CYLINDER 1: ");
        c1.getDimensions();
        System.out.println("ENTER CYLINDER 2: ");
        c2.getDimensions();
        System.out.println("ENTER CYLINDER 3: ");
        c3.getDimensions();

        v1 = c1.volume();
        v2 = c2.volume();
        v3 = c3.volume();

        if (v1 > v2 && v1 > v3) {
            biggest = c1;
        } else if (v2 > v3) {
            biggest = c2;
        } else {
            biggest = c3;
        }

        System.out.println("CYLINDER 1: ");
        c1.displayCylinder();
        System.out.println("CYLINDER 2: ");
        c2.displayCylinder();
        System.out.println("CYLINDER 3: ");
        c3.displayCylinder();
        System.out.println("BIGGEST CYLINDER: ");
        biggest.displayCylinder();
    }
}
