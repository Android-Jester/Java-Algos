package src;
import java.util.Scanner;

public class Assignment_1 {
    static int[][]  array =  new int[3][3];
    static Scanner key = new Scanner(System.in);

    public static void input(int[][] array){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = key.nextInt();
            }
        }
    }
    static void arrange(int[][] array){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
     static double leading_diagonal(int[][] array) {
        double product = 1;
            for (int row = 0; row < 3; row++)
            {
                product *= array[row][row];
            }

            return product;
        }
     static double trailing_diagonal(int[][] array) {
        double product = 1;
        for (int row = 0; row < 3; row++)
        {
            product *= array[row][(array.length - 1) - row];
        }
        return product;
    }


    public static void main(String[] args) {
       System.out.print("Please Input your values: ");
        input(array);
arrange(array);
        System.out.println("Leading Diagonal: "+leading_diagonal(array));
        System.out.println("Trailing Diagonal: "+trailing_diagonal(array));
        double difference = leading_diagonal(array) - trailing_diagonal(array);
        System.out.println("Difference: "+ difference);
    }

}
