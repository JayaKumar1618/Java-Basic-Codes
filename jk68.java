package jaya;
class MyException {
    int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

public class jk68 {

    static void compute(int a) {
        System.out.println("Called compute(" + a + ")");
        if (a > 10) {
            MyException e = new MyException(a);
            System.out.println("Error: " + e);
            return;
        }
        System.out.println("Normal Exit");
    }

    public static void main(String args[]) {
        compute(1);
        compute(2);
        compute(12);
    }

    }

