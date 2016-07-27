package movierental;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();
    private double _totalAmount;
    private int _frequentRenterPoints;

    public Customer(String name) {
        _name = name;
        _totalAmount = 0;
        _frequentRenterPoints = 0;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
        _totalAmount += arg.calculateRent();
        _frequentRenterPoints += arg.calculateFrequentRenterPoints();
    }

    public String getName() {
        return _name;
    }

    public double getTotalAmount() {
        return _totalAmount;
    }

    public int getFrequentRenterPoints() {
        return _frequentRenterPoints;
    }

    public List<Rental> getRentals() {
        return _rentals;
    }

    public String statement() {
        return new ConsoleStatement().statement(this);
    }

    public String htmlStatement() {
        return new HTMLStatement().statement(this);
    }

}
