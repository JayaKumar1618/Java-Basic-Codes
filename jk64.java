package jaya;
class jk64 {
    String name;
    int basicpay;
    int da, hra, va, pf, lic, gross, net;

    jk64(String n, int b) {
        name = n;
        basicpay = b;
    }

    public void calculate() throws payoutOfBoundException {
        if (basicpay < 3000) throw new payoutOfBoundException(basicpay);
        da = basicpay * 17 / 100;
        va = basicpay * 7 / 100;
        hra = basicpay * 25 / 100;
        gross = basicpay + hra + da + va;
        pf = basicpay * 5 / 100;
        lic = basicpay * 6 / 100;
        net = gross - (pf + lic);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + basicpay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("VA: " + va);
        System.out.println("Gross Pay: " + gross);
        System.out.println("PF: " + pf);
        System.out.println("LIC: " + lic);
        System.out.println("Net Pay: " + net);
    }

    public static void main(String[] args) {
        jk64 x = new jk64("Selvaraj", 15000);
        jk64 y = new jk64("Ram", 12000);
        jk64 z = new jk64("Neeta", 2500);

        try {
            x.calculate();
            y.calculate();
            z.calculate();
        } catch (payoutOfBoundException e) {
            System.out.println("Pay out of bounds: " + e.basicpay);
        }

        x.display();
        y.display();
        z.display();
    }
}

class payoutOfBoundException extends Exception {
    int basicpay;

    payoutOfBoundException(int basicpay) {
        this.basicpay = basicpay;
    }
}
