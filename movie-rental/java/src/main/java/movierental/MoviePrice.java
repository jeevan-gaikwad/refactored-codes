package movierental;

/**
 * Created by jeevan on 28/7/16.
 */
public abstract class MoviePrice {

    public static final int DEFAULT_POINTS = 1;

    public abstract double amount(int daysRented);

    public int frequentRenterPoints(int daysRented){
        return DEFAULT_POINTS;
    }
}
