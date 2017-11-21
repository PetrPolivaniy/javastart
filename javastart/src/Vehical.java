/**
 * Created by Admin on 19.11.2017.
 */
public class Vehical {

    int passengers;
    int fuelcup;
    int mpg;

    Vehical(int p, int f, int m) {
        passengers = p;
        fuelcup = f;
        mpg = m;
    }

    double fuelneeded(int miles) {
        return miles / mpg;
    }
}
