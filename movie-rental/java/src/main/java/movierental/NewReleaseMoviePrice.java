package movierental;

/**
 * Created by jeevan on 29/7/16.
 */
public class NewReleaseMoviePrice extends MoviePrice{

    public static final int BASE_FARE = 3;
    public static final int EXTRA_POINTS = 1;

    public double amount(int daysRented) {
        return daysRented * BASE_FARE;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return (daysRented>1) ? (super.frequentRenterPoints(daysRented) + EXTRA_POINTS) : super.frequentRenterPoints(daysRented);
    }
}
