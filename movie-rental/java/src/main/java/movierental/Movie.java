package movierental;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;
    public static final int BLURAY = 3;

    private String _title;
    private MoviePrice _moviePrice;

    public Movie(String title, int priceCode) {
        _title = title;
        _moviePrice =createMoviePrice(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmount(int daysRented) {
        return _moviePrice.amount(daysRented);
    }

    private MoviePrice createMoviePrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                return new RegularMoviePrice();
            case CHILDRENS:
                return new ChildrenMoviePrice();
            case NEW_RELEASE:
                return new NewReleaseMoviePrice();
            case BLURAY:
                return new BluRayMoviePrice();
            default:
                throw new InvalidMoviePriceCodeException("Invalid price code was passed to the createMoviePrice");
        }
    }

    public int calculateFreqRenterPoints(int daysRented) {
        return _moviePrice.frequentRenterPoints(daysRented);
    }
}
