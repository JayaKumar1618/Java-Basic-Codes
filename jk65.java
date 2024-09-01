package jaya;

class markOutOfBoundException extends Exception {
    int mark;
    
    markOutOfBoundException(int a) {
        mark = a;
        System.out.println("Mark out of bound: " + mark);
    }
}

class student {
    String name;
    String result;
    int marks;
    
    student(String n, int m) {
        name = n;
        marks = m;
    }

    public void findResult() throws markOutOfBoundException {
        if (marks > 100) {
            throw new markOutOfBoundException(marks);
        }
        if (marks < 40) {
            result = "fail";
        } else {
            result = "pass";
        }
    }
}

public class jk65 {
    public static void main(String args[]) {
        student m, n, o;
        m = new student("Nandhini", 86);
        n = new student("Sri", 35);
        o = new student("Veena", 112);
        
        try {
            m.findResult();
            System.out.println(m.name + ": " + m.result);
            n.findResult();
            System.out.println(n.name + ": " + n.result);
            o.findResult();
            System.out.println(o.name + ": " + o.result);
        } catch (markOutOfBoundException e) {
            System.out.println("Please validate the mark");
        }
    }
}