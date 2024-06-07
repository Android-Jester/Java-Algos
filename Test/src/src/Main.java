package src;


public class Main{
   static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
    public static void checker(double[] marks){
        for(double i: marks) {
            switch ((int) i) {
                case 1 -> count1++;
                case 2 -> count2++;
                case 3 -> count3++;
                case 4 -> count4++;
                case 5 -> count5++;
            }
        }
      int[] counters = {count1, count2, count3, count4, count5};
      for(int i =0; i < counters.length; i++) System.out.println("The number of " +(i+1)+ "are "+counters [i]);
    }

    public static void main(String[] args) {
        double[] rates = {1, 2, 5, 4, 3, 5, 2, 1, 3, 1, 4, 3, 2, 5, 3, 4, 5, 3, 1};
        checker(rates);
    }
}
