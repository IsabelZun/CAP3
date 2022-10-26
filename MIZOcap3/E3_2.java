import java.util.Random;
public class E3_2 {
    public static void main(String[] args) {
        int[] array = { 0,1, 2, 3, 4, 5, 6, 7, 8, 9 };
        removeElements(array);
    }
    static void removeElements(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println( " ELEMENTO = " +array[index]);
            int[] array1 = new int[array.length - 1];

            for (int i = 0; i < index; i++)
            array1[i] = array[i];

            for (int i = index; i < array.length - 1; i++)
            array1[i] = array[i + 1];
            array = array1;
            
        }
        System.out.println("");
    }
    
}