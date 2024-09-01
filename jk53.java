package jaya;

import java.util.Scanner;

class Employee {
    String emp_name;
    int emp_no;
    float bpay, hra, da, cca, gross, pf, itax, ded, net;
    Scanner sc = new Scanner(System.in);

    void getdetails() {
        System.out.println("Enter Employee Number : ");
        emp_no = sc.nextInt();
        sc.nextLine(); // consume newline left-over
        System.out.println("Enter Employee Name :");
        emp_name = sc.nextLine();
        System.out.println("Enter Employee pay : ");
        bpay = sc.nextFloat();
    }

    void cal_sal() {
        hra = (bpay * 30) / 100;
        da = (bpay * 70) / 100;
        cca = (bpay * 15) / 100;
        gross = bpay + hra + da + cca;
        pf = (bpay * 12) / 100;
        itax = (gross * 5) / 100;
        net = gross - pf - itax;
    }

    void disp_payslip() {
        System.out.println("----------EMPLOYEE PAY SLIP----------");
        System.out.println("EMPLOYEE NUMBER :" + emp_no);
        System.out.println("EMPLOYEE NAME :" + emp_name);
        System.out.println("BASIC PAY :" + bpay);
        System.out.println("HRA :" + hra);
        System.out.println("DA :" + da);
        System.out.println("CCA :" + cca);
        System.out.println("GROSS SALARY :" + gross);
        System.out.println("PF :" + pf);
        System.out.println("INCOME TAX :" + itax);
        System.out.println("NET PAY :" + net);
    }
}

public class jk53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EMPLOYEE PAY SLIP GENERATION");
        
        Employee[] employees = new Employee[5];
        
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i].getdetails();
            employees[i].cal_sal();
        }
        
        for (int i = 0; i < employees.length; i++) {
            employees[i].disp_payslip();
        }
        
        sc.close();
    }
}
