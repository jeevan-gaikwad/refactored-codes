package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie _movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateRent() {
        return _movie.calculateAmount(daysRented);
    }

    int calculateFrequentRenterPoints() {
        return _movie.calculateFreqRenterPoints(daysRented);
    }
}
