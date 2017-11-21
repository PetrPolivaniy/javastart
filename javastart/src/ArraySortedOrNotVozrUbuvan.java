/**
 * Created by Admin on 22.11.2016.
 */
public class ArraySortedOrNotVozrUbuvan {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,4,6,8,12};
        int m = array[0] - array[1];
        int i = 1;
       boolean sorted = true;

        while (i < array.length - 1) {
            int p = array[i] - array[i+1];
            if (m * p < 0) {
                sorted = false;
                break;
            }
            i = i + 1;
        }
        System.out.println(sorted);
    }}