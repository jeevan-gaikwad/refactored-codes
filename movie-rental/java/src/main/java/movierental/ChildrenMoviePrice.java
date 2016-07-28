package movierental;

/**
 * Created by jeevan on 29/7/16.
 */
public class ChildrenMoviePrice extends MoviePrice {

    public static final int BASE_DAYS = 3;
    public static final double BASE_AMOUNT = 1.5;
    public static final double SURCHARGE = 1.5;

    public double amount(int daysRented) {
        return daysRented > BASE_DAYS ? extraAmount(daysRented) : BASE_AMOUNT;
    }

    private double extraAmount(int daysRented) {
        return BASE_AMOUNT +(daysRented-BASE_DAYS)* SURCHARGE;
    }

}
