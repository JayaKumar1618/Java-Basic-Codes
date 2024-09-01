package jaya;

import java.util.Date;

class Computer {
    int ramSize;
    int hardDiskCapacity;
    int processorSpeed;
    String processorMake;
    boolean isColor;

    Computer(int rs, int hdc, int ps, String mk, boolean i) {
        ramSize = rs;
        hardDiskCapacity = hdc;
        processorSpeed = ps;
        processorMake = mk;
        isColor = i;
    }

    public void displayComputer() {
        System.out.println("RAM Size: " + ramSize);
        System.out.println("Hard Disk Capacity: " + hardDiskCapacity);
        System.out.println("Processor Speed: " + processorSpeed);
        System.out.println("Processor Make: " + processorMake);
        if (isColor) {
            System.out.println("Monitor: Color");
        } else {
            System.out.println("Monitor: Monochrome");
        }
    }
}

class Printer {
    String type;
    String make;

    public Printer(String t, String m) {
        type = t;
        make = m;
    }

    public void displayPrinter() {
        System.out.println("Printer Type: " + type);
        System.out.println("Printer Make: " + make);
    }
}

class Teacher {
    String name;
    Date doa;
    String qualification;

    public Teacher(String n, Date d, String q) {
        name = n;
        doa = d;
        qualification = q;
    }

    public void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Date of Appointment: " + doa);
        System.out.println("Qualification: " + qualification);
    }
}

class Lan {
    String os;
    Printer prnt;
    Computer srvr;
    Computer nodel;
    Computer node2;

    public Lan(String o, Printer p, Computer s, Computer n1, Computer n2) {
        os = o;
        prnt = p;
        srvr = s;
        nodel = n1;
        node2 = n2;
    }

    public void displayLan() {
        System.out.println("OS: " + os);
        prnt.displayPrinter();
        srvr.displayComputer();
        nodel.displayComputer();
        node2.displayComputer();
    }
}

class Lab {
    Lan unix;
    Lan nt;
    Lan novell;
    Teacher t1;
    Teacher t2;

    public Lab(Lan u, Lan n, Lan nvl, Teacher t, Teacher ts) {
        unix = u;
        nt = n;
        novell = nvl;
        t1 = t;
        t2 = ts;
    }

    public void displayLab() {
        unix.displayLan();
        nt.displayLan();
        novell.displayLan();
        t1.displayTeacher();
        t2.displayTeacher();
    }
}

public class jk60 {
    Lab ug;
    Lab pg;
    Lab diploma;
    Teacher princi;
    Teacher hod;
    Teacher prof1;
    Teacher prof2;

    public jk60(Lab u, Lab p, Lab d, Teacher pr, Teacher hd, Teacher pr1, Teacher pr2) {
        ug = u;
        pg = p;
        diploma = d;
        princi = pr;
        hod = hd;
        prof1 = pr1;
        prof2 = pr2;
    }

    public void display() {
        ug.displayLab();
        pg.displayLab();
        diploma.displayLab();
        princi.displayTeacher();
        hod.displayTeacher();
        prof1.displayTeacher();
        prof2.displayTeacher();
    }

    public static void main(String[] args) {
        jk60 sarada;
        sarada = new jk60(
            new Lab(
                new Lan("NT", new Printer("InkJet", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", false), new Computer(640, 120, 166, "Intel", true)),
                new Lan("UNIX", new Printer("Laser", "PCL"), new Computer(640, 200, 245, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Lan("NOVELL", new Printer("Dotmatrix", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Teacher("Priya", new Date(96, 3, 5), "B.Sc."),
                new Teacher("Rama", new Date(98, 4, 15), "P.G.D.C.A.")
            ),
            new Lab(
                new Lan("NT", new Printer("InkJet", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", false)),
                new Lan("UNIX", new Printer("Laser", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Lan("NOVELL", new Printer("DotMatrix", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Teacher("Vishnu", new Date(98, 1, 1), "D.C.T."),
                new Teacher("Mala", new Date(98, 1, 1), "B.Sc.")
            ),
            new Lab(
                new Lan("NT", new Printer("InkJet", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Lan("UNIX", new Printer("Laser", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Lan("NOVELL", new Printer("Dot Matrix", "PCL"), new Computer(640, 120, 166, "Intel", true), new Computer(64, 240, 199, "Intel", true), new Computer(640, 120, 166, "Intel", true)),
                new Teacher("Priya", new Date(98, 1, 1), "D.C.A."),
                new Teacher("Rama", new Date(98, 1, 1), "B.Sc.")
            ),
            new Teacher("Krishna Priya", new Date(98, 1, 1), "Ph.D."),
            new Teacher("PadmaShree", new Date(98, 1, 1), "M.Phil."),
            new Teacher("Vajreshwari", new Date(98, 1, 1), "M.Sc."),
            new Teacher("Malathi", new Date(98, 1, 1), "M.C.A.")
        );

        sarada.display();
    }
}
