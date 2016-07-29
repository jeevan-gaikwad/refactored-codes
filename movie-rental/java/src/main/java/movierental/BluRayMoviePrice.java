package movierental;

/**
 * Created by jeevan on 29/7/16.
 */
public class BluRayMoviePrice extends MoviePrice {

    public static final double BASE_FARE = 4;
    public static final int EXTRA_POINTS = 2;

    public double amount(int daysRented) {
        return daysRented * BASE_FARE;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return (daysRented>2) ? extraPoints(daysRented) : super.frequentRenterPoints(daysRented);
    }

    private int extraPoints(int daysRented) {
        return super.frequentRenterPoints(daysRented)+ EXTRA_POINTS;
    }
}
