package jaya;

import java.util.Scanner;

class Student {
    private int sno;
    private String name;
    private int[] marks = new int[5];
    private int total;
    private char grade;

    public Student(int sno, String name, int[] marks) {
        this.sno = sno;
        this.name = name;
        this.marks = marks;
        this.total = calculateTotal();
        this.grade = calculateGrade();
    }

    private int calculateTotal() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    private char calculateGrade() {
        if (total >= 450) {
            return 'A';
        } else if (total >= 400) {
            return 'B';
        } else if (total >= 350) {
            return 'C';
        } else if (total >= 300) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getTotal() {
        return total;
    }

    public char getGrade() {
        return grade;
    }
    public class jk52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Sno: ");
            int sno = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            students[i] = new Student(sno, name, marks);
        }

        for (Student student : students) {
            System.out.println("Student " + student.getSno() + " (" + student.getName() + "):");
            System.out.println("Total Marks: " + student.getTotal());
            System.out.println("Grade: " + student.getGrade());
        }

    }
    }
}
