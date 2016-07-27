package movierental;

import java.util.List;

/**
 * Created by jeevan on 27/7/16.
 */
public class ConsoleStatement implements  Statement{

    public String statement(Customer customer) {
        return header(customer.getName())+ body(customer.getRentals())+
                footer(customer.getTotalAmount(),customer.getFrequentRenterPoints());
    }
    private String header(String name) {
        return "Rental Record for " + name + "\n";
    }
    private String body(List<Rental> rentals) {
        String result="";
        for(Rental each: rentals)
            result += "\t" + each.getMovie().getTitle() + "\t" + each.calculateRent() + "\n";
        return result;
    }
    private String footer(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + totalAmount + "\n"
                +"You earned " + frequentRenterPoints + " frequent renter points";
    }
}
