package jaya;
import java.util.Scanner;

class employee {
    String empName, empDesig, empDob;
    int empNo;
    float bpay, hra, da, cca, gross, pf, itax, net;

    Scanner sc = new Scanner(System.in);

    void getEmp() {
        System.out.println("Enter employee number: ");
        empNo = Integer.parseInt(sc.nextLine());

        System.out.println("Enter employee name: ");
        empName = sc.nextLine();

        System.out.println("Enter employee DOB: ");
        empDob = sc.nextLine();

        System.out.println("Enter basic pay: ");
        bpay = sc.nextFloat();
        sc.nextLine();  // Consume the newline
    }

    void calSal() {
        hra = (bpay * 30) / 100;
        da = (bpay * 70) / 100;
        cca = (bpay * 50) / 100;
        gross = bpay + hra + da + cca;
        pf = (bpay * 12) / 100;
        itax = (gross * 5) / 100;
        net = gross - pf - itax;
    }

    void dispPayslip() {
        System.out.println("----- Employee Pay Slip -----");
        System.out.println("Employee number: " + empNo);
        System.out.println("Employee name: " + empName);
        System.out.println("Employee Desig: " + empDesig);
        System.out.println("Employee DOB: " + empDob);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("CCA: " + cca);
        System.out.println("Gross salary: " + gross);
        System.out.println("PF: " + pf);
        System.out.println("Income Tax: " + itax);
        System.out.println("Net Pay: " + net);
    }
}

class Manager extends Employee {
    String title, loc;

    void getMang() {
        System.out.println("Enter title of Manager: ");
        title = sc.nextLine();

        System.out.println("Enter location: ");
        loc = sc.nextLine();
    }
    void dispPayslipm() {
        System.out.println("----- Manager Pay Slip -----");
        System.out.println("Employee number: " + empNo);
        System.out.println("Employee name: " + empName);
        System.out.println("Employee Desig: " + empDesig);
        System.out.println("Employee DOB: " + empDob);
        System.out.println("Manager title " + title);
        System.out.println("Manager location : " + loc);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("CCA: " + cca);
        System.out.println("Gross salary: " + gross);
        System.out.println("PF: " + pf);
        System.out.println("Income Tax: " + itax);
        System.out.println("Net Pay: " + net);
    }
   
    }

public class jk56 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Employee e1 = new Employee();

        e1.getEmp();
        e1.calSal();
        e1.dispPayslip();
        System.out.println("=============================================");
        m.getEmp();
        m.getMang();
        m.calSal();
        m.dispPayslipm();
    }
}
