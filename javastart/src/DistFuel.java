/**
 * Created by Admin on 19.11.2017.
 */
public class DistFuel {
    public static void main(String[] args) {
        Vehical minivan = new Vehical(7, 30, 21);
        Vehical sportcar = new Vehical(2, 20, 12);
        int dist = 252;
        double gall;

        gall = minivan.fuelneeded(dist);
        System.out.println(gall);

    }
}
