
public class Algo1 {

    static int find(final int[] array) {
            
        for(int i = 0; i <array.length; i++){
            if(array[i+1] != array[i]){
                break;
            }
            return array[i+1];    
        }
        
    }  


    public static void main(String []args){
        int []arc = {1, 2, 3, 5};
        System.out.println("The Value of non-consecutive value is" + find(arc));
        
    }
}