package com.company;

public class Calculations {

    public static void grading(double score) {
        switch((int) score){
            case 70:
                System.out.println("Grade: A");
                break;
            case 69:
                System.out.println("Grade: B");
                break;
            case 59:
                System.out.println("Grade: C");
                break;
            case 49:
                System.out.println("Grade: D");
                break;
            case 39:
                System.out.println("Grade: CONDONED");
            case 38:
                System.out.println("Grade: F");
                break;

            }
    }
    public static double add(double[] score) {
     double sum = 0;
        for (double i:
             score) {
            sum+=i;
        }
     return sum;
    }
    public static double average(double[] score) {
        return add(score) / score.length;
    }
    public static double max(double[] score) {
        double maximum = 0;
        for (double i: score) {
            maximum = Math.max(maximum,i);
        }
        return maximum;
    }
    public static double min( double[] score) {
        double minimum = 0;
        for (double i: score) {
            minimum = Math.min(minimum,i);
        }
        return minimum;
    }
    public static double median(double[] score) {
        double median, temp;
        for (int i = 0; i < score.length; i++) {
            for (int j = i+1; j < score.length; j++) {
                if(score[i] > score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        if(score.length % 2 == 0) {
            median = score[(score.length / 2) + 1];
        } else {
            median = score[score.length / 2];
        }
        return median;
    }
    public static double standard_deviation(double[] score) {
        double solution = 0;
        for(double i : score) {
            solution += (average(score) - i);
        }
        return solution/ score.length;

    }
    public static double Mode(double[] score) {
        int index = 0  ;
        int soFar = 1 ;
        int count = 1 ;
        for(int k =1;   k < score.length; k++){

            if (score[k-1] == score[k]){
                count++ ; }
            if(count > soFar)
            {
                soFar = count ;
                index = k ;
            }
            else {
                count = 1 ;
            }
        }
        return score[index] ;
    }
public static void graph(double[] score) {
    for(int i = 0; i < 2; i++) {
        if(i == 1) {
            System.out.println("________________________________________________________");
        } else {
            System.out.println("|");
            for(int j = 0; j < score.length; j++) {
                String shi = new String(new char[(int) score[j/10]]).replace("\0" , "\t");
            }
        }
    }
}
