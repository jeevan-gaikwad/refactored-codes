package movierental;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    private String _title;

    private MoviePrice moviePrice;

    public Movie(String title, int priceCode) {
        _title = title;
        moviePrice=createMoviePrice(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmount(int daysRented) {
        return moviePrice.amount(daysRented);
    }

    private MoviePrice createMoviePrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                return new RegularMoviePrice();
            case CHILDRENS:
                return new ChildrenMoviePrice();
            case NEW_RELEASE:
                return new NewReleaseMoviePrice();
        }
        return null;
    }

    public int calculateFreqRenterPoints(int daysRented) {
        return moviePrice.frequentRenterPoints(daysRented);
    }
}
