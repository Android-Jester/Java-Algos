package com.company;
import java.util.Scanner;
public class Main {
    public static boolean fees(double amount){
        if(amount <  100) {
          System.out.println("FEES NOT PAID");
          return false;
        } else {
            System.out.println("FEES PAID");
            return true;
        }
    }

    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****************** \n");
        System.out.print("How many students are being recorded: ");
        int n = key.nextInt();
        double[] students = new double[n];

        System.out.println("****************** \n");
        System.out.print("Fees Paid: ");
        double fees = key.nextDouble();
        for (double i: students) {
            if(fees(fees)){
                System.out.print("Exam Score: ");
                double exam_score = key.nextDouble();
                System.out.print("Assessment Score: ");
                double assessment_score = key.nextDouble();
                i = exam_score + assessment_score;
                Calculations.grading(i);
            }
        }
        System.out.println("Average Score: "+Calculations.average(students));
        System.out.println("Minimum Score: "+Calculations.min(students));
        System.out.println("Maximum Score: "+Calculations.max(students));
        System.out.println("Median Score: "+Calculations.median(students));
        System.out.println("Standard Deviation: "+Calculations.standard_deviation(students));
        System.out.println("Mode: "+Calculations.Mode(students));
	graph(students);
	// write your code here
    }
}
