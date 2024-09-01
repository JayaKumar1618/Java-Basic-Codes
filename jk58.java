package jaya;

import java.util.Scanner;

class Address {
    int pincode;
    String doorno, st, area, city;
    Scanner sc = new Scanner(System.in);

    void getaddr() {
        System.out.println("Enter door number:");
        doorno = sc.nextLine();
        System.out.println("Enter street:");
        st = sc.nextLine();
        System.out.println("Enter area:");
        area = sc.nextLine();
        System.out.println("Enter city:");
        city = sc.nextLine();
        System.out.println("Enter pincode:");
        pincode = Integer.parseInt(sc.nextLine());
    }

    void dispaddr() {
        System.out.println("Address: " + doorno + ", " + st + ", " + area + ", " + city + ", " + pincode);
    }
}

class employee1 extends Address {
    String emp_name, emp_desig, emp_dob;
    Address caddr = new Address(), paddr = new Address();
    int emp_no;
    float bpay, hra, da, cca, gross, pf, itax, ded, net;
    Scanner sc = new Scanner(System.in);

    void getemp() {
        System.out.println("Enter employee number: ");
        emp_no = Integer.parseInt(sc.nextLine());

        System.out.println("Enter employee name: ");
        emp_name = sc.nextLine();

        System.out.println("Enter employee DOB: ");
        emp_dob = sc.nextLine();

        System.out.println("Enter current Address: ");
        caddr.getaddr();

        System.out.println("Enter permanent Address: ");
        paddr.getaddr();

        System.out.println("Enter basic pay: ");
        bpay = sc.nextFloat();
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
}

class Manager1 extends employee1 {
    String title, loc;
    Scanner sc = new Scanner(System.in);

    void getMang() {
    	
        System.out.println("Enter title of Manager: ");
        title = sc.nextLine();

        System.out.println("Enter location: ");
        loc = sc.nextLine();
    }

    void dispPayslip() {
        System.out.println("----- Manager Pay Slip -----");
        System.out.println("Employee number: " + emp_no);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Employee Desig: " + emp_desig);
        System.out.println("Employee DOB: " + emp_dob);
        System.out.println("Manager title: " + title);
        System.out.println("Manager location: " + loc);
        System.out.println("Current Address: ");
        caddr.dispaddr();
        System.out.println("Permanent Address: ");
        paddr.dispaddr();
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

public class jk58 {
    public static void main(String[] args) {
        Manager1 m = new Manager1();
        m.getemp();
        m.calSal();
        m.getMang();
        m.dispPayslip();
    }
}
