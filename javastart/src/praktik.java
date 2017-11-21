import com.sun.javafx.geom.AreaOp;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Admin on 02.11.2017.
 */
public class praktik {
    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 15, 15, 21, 0};
        for (int i = 0; i < ints.length; i++) {
            int lovest = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                if (lovest > ints[j]) {
                    int g = lovest;
                    lovest = ints[j];
                    ints[j] = g;
                    ints[i] = lovest;
                }
            }
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }
}