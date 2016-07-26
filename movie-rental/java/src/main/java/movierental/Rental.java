package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateRent() {
        //determine amounts for each line
        double thisAmount=0.0;
        switch (_movie.getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (_daysRented > 2)
                    thisAmount += (_daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += _daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (_daysRented > 3)
                    thisAmount += (_daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    int calculateFrequentRenterPoints() {
        // add frequent renter points
        int frequentRenterPoints=1;
        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && _daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
