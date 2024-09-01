package jaya;

import java.util.Scanner;

public class jk22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathMarks, phyMarks, cheMarks, passMarksMath, passMarksOthers,passMarksphy;
	    passMarksMath = 60;
	    passMarksOthers = 40;
	    passMarksphy = 50;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math Marks: ");
        mathMarks= sc.nextInt();
        System.out.print("Enter Physics Marks: ");
        phyMarks= sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        cheMarks= sc.nextInt();
	    if (mathMarks >= passMarksMath && phyMarks >= passMarksphy && cheMarks >= passMarksOthers) {
	    	System.out.println("Grade: 1 (Pass in all subjects)");	
	    } else if ((mathMarks >= passMarksMath && phyMarks >=passMarksphy) ||
	               (mathMarks >= passMarksMath && cheMarks >= passMarksOthers) ||
	               (phyMarks >= passMarksphy && cheMarks >= passMarksOthers)) {
	    	System.out.println("Grade: 2 (Pass in two subjects)");	
	    } else if (mathMarks >= passMarksMath || phyMarks >=passMarksphy || cheMarks >= passMarksOthers) {
	    	System.out.println("Grade: 3 (Pass in one subject)" );	
	    } else {
	    	System.out.println("Grade: 0 (Fail in all subjects)");	
	    }

	}

}
