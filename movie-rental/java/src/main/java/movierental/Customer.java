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
        _totalAmount += arg.calculateRent();
        _frequentRenterPoints += arg.calculateFrequentRenterPoints();
        _rentals.add(arg);

    }

    public String getName() {
        return _name;
    }

    public String statement() {
        return header()+ body()+ footer();
    }

    private String footer() {
        return "Amount owed is " + _totalAmount + "\n"
                +"You earned " + _frequentRenterPoints + " frequent renter points";
    }

    private String body() {
        String result="";
        for(Rental each:_rentals)
            result += "\t" + each.getMovie().getTitle() + "\t" + each.calculateRent() + "\n";
        return result;
    }

    private String header() {
        return "Rental Record for " + _name + "\n";
    }


    public String htmlStatement() {
        return htmlHeader() + htmlBody() + htmlFooter();
    }

    private String htmlFooter() {
        return  "<b>Amount owed is "+ _totalAmount +"\n<br>" +
                "You earned "+ _frequentRenterPoints +" frequent renter points</b>";
    }

    private String htmlBody() {
        String result="";
        for(Rental each:_rentals)
            result+="\t" + each.getMovie().getTitle() + "\t" + each.calculateRent() + "\n<br>";
        return result;
    }

    private String htmlHeader() {
        return "<h1>Rental Record for "+_name+"</h1>\n";
    }
}
