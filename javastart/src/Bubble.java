/**
 * Created by Admin on 08.11.2017.
 */
public class Bubble {
    public static void main(String[] args) {
   int [] array = {23, 18, 48, 1, 5, 200, -6, 11, 13, -3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int n : array ) {
            System.out.println(n + ",");
        }
    }
}
