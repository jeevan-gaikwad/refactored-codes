package movierental;

import java.util.List;

/**
 * Created by jeevan on 27/7/16.
 */
public class HTMLStatement implements  Statement {
    public String statement(Customer customer) {
        return htmlHeader(customer.getName()) + htmlBody(customer.getRentals()) + htmlFooter(customer.getTotalAmount(),
                customer.getFrequentRenterPoints());
    }
    private String htmlHeader(String name) {
        return "<h1>Rental Record for "+ name +"</h1>\n";
    }

    private String htmlBody(List<Rental> rentals) {
        String result="";
        for(Rental each: rentals)
            result+="\t" + each.getMovie().getTitle() + "\t" + each.calculateRent() + "\n<br>";
        return result;
    }

    private String htmlFooter(double totalAmount, int frequentRenterPoints) {
        return  "<b>Amount owed is "+ totalAmount +"\n<br>" +
                "You earned "+ frequentRenterPoints +" frequent renter points</b>";
    }
}
