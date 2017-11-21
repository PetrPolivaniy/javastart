/**
 * Created by Admin on 12.11.2017.
 */
public class Binsearch {
    public static void main(String[] args) {
        char[]array = {'a','d','f','l','o','z'};
        find(array,'p');
            }
    public static void find(char[]array,char ch){
        int last = array.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;
        while (array[mid] != ch && last != mid && first != mid) {
            if (array[mid] < ch) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (array[last] == ch)
            mid = last;
        if (array[first] == ch)
            mid = first;
        System.out.print(array[mid] == ch ? mid : "Elem not found");
    }
}
